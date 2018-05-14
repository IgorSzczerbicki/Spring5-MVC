package com.nauka.spring5.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	//metoda kontrolera do wyswietlania formularza
		@RequestMapping("/showFormUpperCase")
		public String showFormUpperCase() {
			return "helloFormUpper";
		}
	
	//metoda pobiera dane z formularza, zmienia je po czym dodaje do modelu
	@RequestMapping("/processFormUpperCase")
	public String processFormUpperCase(HttpServletRequest request, Model model) {
		//pobranie danych z formularza
		String theName = request.getParameter("name");
		
		//zamiana na duze litery
		theName = theName.toUpperCase();
		
		//stworzenie wiadomosci wynikowej
		String result = "Hej " + theName;
		
		//dodanie wyniku do modelu
		model.addAttribute("message", result);
		
		//zwrocenie nazwy widoku
		return "helloUpper";
	}
}