package com.rest.service.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ProjectDetails")
public class Projects {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_id;

	@Column(name = "ProjectName")
	private String projectName;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "project")
	private Set<Employee> employee=new HashSet<Employee>();

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	public Projects() {

	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "ProjectDetails [ projectName=" + projectName + "]";
	}

}
