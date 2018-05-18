package com.nauka.spring5.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String prefix;
	
	public void initialize(CourseCode courseCode) {
		this.prefix = courseCode.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		boolean result = false;
		
		if (value != null) {
			result = value.startsWith(this.prefix);
		} else {
			result = true;
		}
		return result;
	}

}
