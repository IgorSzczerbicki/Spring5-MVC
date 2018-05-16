package com.nauka.spring5.mvc.domain;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private String surname;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	private Map<String, String> countryOptions;
	private Map<String, String> languageOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("PL", "Poland");
		countryOptions.put("IE", "Ireland");
		countryOptions.put("DE", "Germany");
		
		languageOptions = new LinkedHashMap<>();
		
		languageOptions.put("Java", "Java");
		languageOptions.put("C#", "C#");
		languageOptions.put("Scala", "Scala");
	}

	public Student(String n, String s) {
		this();
		this.name = n;
		this.surname = s;
	}
	
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public Map<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

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