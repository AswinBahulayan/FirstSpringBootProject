package com.first.rest.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping
	public Iterable<Employeedata> getUser() {
		try {
			return employeeRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@PostMapping()
	public String createEmployee(@RequestBody Employeedata[] employeedata) {
		for (Employeedata employeedata2 : employeedata) {
			employeeRepository.save(employeedata2);
		}
		return "new employee created";
	}

}
