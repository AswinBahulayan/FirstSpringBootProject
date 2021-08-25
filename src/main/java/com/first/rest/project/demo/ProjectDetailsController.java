package com.first.rest.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectDetailsController {
	
	@Autowired
	private ProjectDetailsRepository projectDetailsRepository;
	
	@GetMapping()
	public Iterable<ProjectDetails> getProjectDetails(){
		Iterable<ProjectDetails> findAll = projectDetailsRepository.findAll();
		return findAll;
	}
		
	@PostMapping()
	public String createProjectDetails(@RequestBody ProjectDetails[] projectDetials) {
		for (ProjectDetails project : projectDetials) {
			projectDetailsRepository.save(project);
		}
		return "new employee created";
	}
}
