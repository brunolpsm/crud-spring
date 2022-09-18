package com.bruno.crudspring.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController implements Serializable {

	private static final long serialVersionUID = 1L;

	@GetMapping
	public String hello() {
		return "Hello World.";
	}
	
}