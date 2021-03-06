package com.nauka.spring5.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy= CourseCodeConstraintValidator.class)
public @interface CourseCode {

	public String value() default "IS";
	
	public String message() default "musi zaczyna� si� od \"IS\"";
	
	public Class<?>[] groups() default {};
	
	public Class <? extends Payload>[] payload() default {};
}