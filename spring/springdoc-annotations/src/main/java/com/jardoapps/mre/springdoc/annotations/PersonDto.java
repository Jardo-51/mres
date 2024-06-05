package com.jardoapps.mre.springdoc.annotations;

import io.swagger.v3.oas.annotations.media.Schema;

public class PersonDto {

	@PersonIdField
	private String id;

	@Schema(description = "Person name", example = "Carlos Santana")
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
