package com.nauka.spring5.mvc.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.nauka.spring5.mvc.validation.CourseCode;

public class Customer {

		private String name;
		
		@NotNull(message="wymagane pole")
		@Size(min=1, message="wymagane pole")
		private String surname;
		
		@NotNull(message="wymagane pole")
		@Min(value=0, message="wiek wiêkszy ni¿ 0")
		@Max(value = 100, message="wiek mniejszy ni¿ 100")
		private Integer age;
		
		@Pattern(regexp="^[a-zA-Z0-9]{5}", message="dok³adnie 5 znaków")
		private String signs;
		
		@CourseCode
		private String courseCode;

		public String getName() {
			return name;
		}

		public String getCourseCode() {
			return courseCode;
		}

		public void setCourseCode(String courseCode) {
			this.courseCode = courseCode;
		}

		public String getSigns() {
			return signs;
		}

		public void setSigns(String signs) {
			this.signs = signs;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}
}
