package com.epam.training.jp.jpa.excercises.domain;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private int id;
	
	private String street;
	
	private String country;
	
	private String city;
	
	private String zipCode;
	
	public Address() { }
	
	public Address(int id, String street, String country, String city, String zipCode) {
		this.id = id;
		this.street = street;
		this.country = country;
		this.city = city;
		this.zipCode = zipCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getZipCode() {
		return zipCode;
	}

}
