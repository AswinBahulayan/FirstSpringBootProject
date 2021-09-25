package com.rest.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.service.domain.ProjectDetailsRepository;
import com.rest.service.model.Projects;


@RestController
@RequestMapping("/project")
public class ProjectDetailsController {
	
	@Autowired
	private ProjectDetailsRepository projectDetailsRepository;
	
	@GetMapping("/details")
	public Iterable<Projects> getProjectDetails(){
		Iterable<Projects> findAll = projectDetailsRepository.findAll();
		return findAll;
	}
		
	@PostMapping("/create/project")
	public String createProjectDetails(@RequestBody Projects[] projectDetials) {
		for (Projects project : projectDetials) {
			projectDetailsRepository.save(project);
		}
		return "employee added to project";
	}
}
