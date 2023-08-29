package com.manufacturer.manage.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact",schema = "manufacturer_schema")
public class ContactEntity {
	
	@Id
	@Column(name = "contact_id")
	private int contactId;
	
	@Column(name= "contact_type")
	private String contactType;
	
	private String value;
	
	@JsonBackReference("manufacturer_contact")
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "manufacturer_id")
	private ManufacturerEntity ManufacturerEntity;

	public ContactEntity() {
		super();
	}

	public ContactEntity(int contactId, String contactName, String value) {
		super();
		this.contactId = contactId;
		this.contactType = contactType;
		this.value = value;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactType;
	}

	public void setContactName(String contactName) {
		this.contactType = contactName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
