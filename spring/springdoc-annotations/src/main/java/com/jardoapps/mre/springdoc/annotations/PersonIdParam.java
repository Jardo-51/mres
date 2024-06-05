package com.jardoapps.mre.springdoc.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import io.swagger.v3.oas.annotations.Parameter;

@Retention(RetentionPolicy.RUNTIME)
@Parameter(description = "Person identifier", example = "1234")
public @interface PersonIdParam {

}
