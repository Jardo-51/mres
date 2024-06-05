package com.jardoapps.mre.springdoc.annotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class PersonController {

	@GetMapping("/person/{id}")
	public Mono<PersonDto> getById(@PathVariable @PersonIdParam String id) {
		PersonDto personDto = new PersonDto();
		personDto.setId(id);
		personDto.setName("John Doe");
		return Mono.just(personDto);
	}
}
