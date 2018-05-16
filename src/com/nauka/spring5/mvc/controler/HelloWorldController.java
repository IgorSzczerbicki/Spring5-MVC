package com.nauka.spring5.mvc.controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//metoda kontrolera do wyswietlania formularza
	@RequestMapping("/showForm")
	public String showForm() {
		return "hello/helloForm";
	}
	
	//metoda kontrolera do przetwarzania formularza
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello/hello";
	}
}