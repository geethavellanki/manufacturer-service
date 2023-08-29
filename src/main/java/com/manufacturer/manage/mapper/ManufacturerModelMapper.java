package com.manufacturer.manage.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.manufacturer.manage.entity.AddressEntity;
import com.manufacturer.manage.entity.ContactEntity;
import com.manufacturer.manage.entity.ManufacturerEntity;
import com.manufacturer.manage.model.AddressModel;
import com.manufacturer.manage.model.ContactModel;
import com.manufacturer.manage.model.ManufacturerModel;

public class ManufacturerModelMapper {

	public ManufacturerModel entityToManufacturerModel(ManufacturerEntity manufacturerEntity) {
		ManufacturerModel manufacturerModel = new ManufacturerModel();
		BeanUtils.copyProperties(manufacturerEntity, manufacturerModel);
		manufacturerModel.setContactModels(entityToContactModels(manufacturerEntity.getContactEntity()));
		manufacturerModel.setAddressModel(entityToAddressModel(manufacturerEntity.getAddressEntity()));
		return manufacturerModel;
	}

	public AddressModel entityToAddressModel(AddressEntity addressEntity) {
		AddressModel addressModel = new AddressModel();
		BeanUtils.copyProperties(addressEntity, addressModel);
		return addressModel;
	}

	public ContactModel entityToContactModel(ContactEntity contactEntity) {
		ContactModel contactModel = new ContactModel();
		BeanUtils.copyProperties(contactEntity, contactModel);
		return contactModel;
	}

	public List<ContactModel> entityToContactModels(List<ContactEntity> contactEntities) {
		return contactEntities.stream().map(contactEntity -> entityToContactModel(contactEntity))
				.collect(Collectors.toList());
	}

}