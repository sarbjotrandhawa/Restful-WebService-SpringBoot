package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;


public class User {

	private Integer id;
	
	@Size(min=2, message="Name should have more than 2 characters.")
	private String name;
	
	//This will take only past dates as compared to today date.
	@Past
	private Date birthDate;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
