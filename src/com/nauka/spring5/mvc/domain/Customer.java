package com.nauka.spring5.mvc.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

		private String name;
		
		@NotNull(message="wymagane pole")
		@Size(min=1, message="wymagane pole")
		private String surname;

		public String getName() {
			return name;
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
