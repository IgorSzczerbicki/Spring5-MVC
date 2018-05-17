package com.nauka.spring5.mvc.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

		private String name;
		
		@NotNull(message="wymagane pole")
		@Size(min=1, message="wymagane pole")
		private String surname;
		
		@Min(value=0, message="wiek wiêkszy ni¿ 0")
		@Max(value = 100, message="wiek mniejszy ni¿ 100")
		private int age;

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
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
