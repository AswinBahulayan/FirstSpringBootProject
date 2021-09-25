package com.rest.service.domain;

import org.springframework.data.repository.CrudRepository;

import com.rest.service.model.Projects;


public interface ProjectDetailsRepository extends CrudRepository<Projects, Integer> {

}
