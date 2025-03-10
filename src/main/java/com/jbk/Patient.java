package com.jbk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
	private int id;
	private String name;
	private String city;
	private String bloodgrp;
	private int age;

	public Patient() {

	}

	public Patient(int id, String name, String city, String bloodgrp, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.bloodgrp = bloodgrp;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBloodgrp() {
		return bloodgrp;
	}

	public void setBloodgrp(String bloodgrp) {
		this.bloodgrp = bloodgrp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", city=" + city + ", bloodgrp=" + bloodgrp + ", age=" + age
				+ "]";
	}

}
