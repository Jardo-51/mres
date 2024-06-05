package com.jardoapps.mre.springdoc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.swagger.v3.oas.annotations.media.Schema;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Schema(description = "Person identifier", example = "1234")
public @interface PersonIdField {

}
