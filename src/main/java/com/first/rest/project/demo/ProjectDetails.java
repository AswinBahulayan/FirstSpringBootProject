package com.first.rest.project.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity()
@Table(name = "ProjectDetails")
public class ProjectDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProjectID", unique = true, nullable = false)
	int projectId;

	@Column(name = "ProjectName")
	String projectName;
	
	@JoinColumn(name = "employeeId", referencedColumnName = "id")
	int employeeid;

	public ProjectDetails() {

	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName +"]";
	}
	
}
