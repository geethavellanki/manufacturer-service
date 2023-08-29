package com.manufacturer.manage.mapper;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.manufacturer.manage.entity.AddressEntity;
import com.manufacturer.manage.entity.ContactEntity;
import com.manufacturer.manage.entity.ManufacturerEntity;
import com.manufacturer.manage.model.AddressModel;
import com.manufacturer.manage.model.ContactModel;
import com.manufacturer.manage.model.ManufacturerModel;

public class ManufacturerEntityMapper {

	public ManufacturerEntity modelToManufacturerEntity(ManufacturerModel manufacturerModel) {
		manufacturerModel.setManufacturerId(manufacturerModel.getManufacturerId());
		ManufacturerEntity manufacturerEntity = new ManufacturerEntity();
		BeanUtils.copyProperties(manufacturerModel, manufacturerEntity);
		manufacturerEntity.setContactEntity(modelToContactEntities(manufacturerModel.getContactModels()));
		manufacturerEntity.setAddressEntity(modelToAddressEntity(manufacturerModel.getAddressModel()));
		return manufacturerEntity;
	}

	public AddressEntity modelToAddressEntity(AddressModel addressModel) {
		addressModel.setAddressId(getId(addressModel.getAddressId()));
		AddressEntity addressEntity = new AddressEntity();
		BeanUtils.copyProperties(addressModel, addressEntity);
		return addressEntity;
	}

	public ContactEntity modelToContactEntity(ContactModel contactModel) {
		contactModel.setContactId(getId(contactModel.getContactId()));
		ContactEntity contactEntity = new ContactEntity();
		BeanUtils.copyProperties(contactModel, contactEntity);
		return contactEntity;
	}

	public List<ContactEntity> modelToContactEntities(List<ContactModel> contactModels) {
		return contactModels.stream().map(contactModel -> modelToContactEntity(contactModel))
				.collect(Collectors.toList());
	}

	public int getId(int id) {
		if (id <= 0) {
			id = UUID.randomUUID().hashCode();
			System.out.println("Id from UUID--->" + id);
		}
		return id;
	}

}
