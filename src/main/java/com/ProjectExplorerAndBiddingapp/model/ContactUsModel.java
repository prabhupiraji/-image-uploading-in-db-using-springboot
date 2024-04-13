package com.ProjectExplorerAndBiddingapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contactus_db")
public class ContactUsModel {
	@Id
	String name;
	String email;
	String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ContactUsModel(String name, String email, String message) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
	}
	public ContactUsModel() {
		super();
	
	}
	
}
