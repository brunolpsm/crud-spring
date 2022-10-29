package com.bruno.crudspring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Table(name = "courses")
@Data
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("_id")
//	@JsonIgnore
	private Long id;

	@Column(length = 200, nullable = false)
	@JsonProperty("name")
	private String nome;

	@Column(length = 10, nullable = false)
	@JsonProperty("category")
	private String categoria;

}
