package com.bruno.crudspring.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.crudspring.model.Course;
import com.bruno.crudspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/courses")
public class CourseController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private final CourseRepository repository;

	@GetMapping
	public List<Course> allCourses() {
		return repository.findAll();
	}

}
