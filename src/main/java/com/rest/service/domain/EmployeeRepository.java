package com.rest.service.domain;

import org.springframework.data.repository.CrudRepository;

import com.rest.service.model.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
