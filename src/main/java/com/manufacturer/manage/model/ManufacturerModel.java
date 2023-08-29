package com.manufacturer.manage.model;

import java.sql.Date;
import java.util.List;

import jakarta.validation.constraints.NotBlank;

public class ManufacturerModel {
	private int manufacturerId;
	@NotBlank(message = "companyName should not null")
	private String companyName;
	@NotBlank(message = "registrationnumber should not null")
	private String registrationnumber;
	private Date registrationDate;
	private String description;

	private AddressModel addressModel;
	private List<ContactModel> contactModels;

	public ManufacturerModel() {
	}

	public ManufacturerModel(int manufacturerId, String companyName, String registrationnumber, Date registrationDate,
			String description, AddressModel addressModel, List<ContactModel> contactModels) {
		super();
		this.manufacturerId = manufacturerId;
		this.companyName = companyName;
		this.registrationnumber = registrationnumber;
		this.registrationDate = registrationDate;
		this.description = description;
		this.addressModel = addressModel;
		this.contactModels = contactModels;
	}

	public int getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRegistrationnumber() {
		return registrationnumber;
	}

	public void setRegistrationnumber(String registrationnumber) {
		this.registrationnumber = registrationnumber;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AddressModel getAddressModel() {
		return addressModel;
	}

	public void setAddressModel(AddressModel addressModel) {
		this.addressModel = addressModel;
	}

	public List<ContactModel> getContactModels() {
		return contactModels;
	}

	public void setContactModels(List<ContactModel> contactModels) {
		this.contactModels = contactModels;
	}

	@Override
	public String toString() {
		return "ManufacturerModel [manufacturerId=" + manufacturerId + ", companyName=" + companyName
				+ ", registrationnumber=" + registrationnumber + ", registrationDate=" + registrationDate
				+ ", description=" + description + ", addressModel=" + addressModel + ", contactModels=" + contactModels
				+ "]";
	}

}