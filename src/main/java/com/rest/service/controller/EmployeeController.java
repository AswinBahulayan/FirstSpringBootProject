package com.rest.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.service.domain.EmployeeRepository;
import com.rest.service.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/getall")
	public Iterable<Employee> getUser() {
		try {
			return employeeRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@PostMapping("/create")
	public String createEmployee(@RequestBody Employee[] employeedata) {
		for (Employee employeedata2 : employeedata) {
			employeeRepository.save(employeedata2);
		}
		return "new employee created";
	}

}
