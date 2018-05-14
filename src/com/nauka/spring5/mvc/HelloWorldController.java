package com.nauka.spring5.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	//metoda kontrolera do wyswietlania formularza
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloForm";
	}
	
	//metoda kontrolera do przetwarzania formularza
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello";
	}
}