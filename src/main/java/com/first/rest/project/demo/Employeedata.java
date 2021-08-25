package com.first.rest.project.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Table(name = "employeeData")
public class Employeedata {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String firstname;
	String lastname;
	String company;

	public Employeedata() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employeedata [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", company=" + company
				+ "]";
	}

}
