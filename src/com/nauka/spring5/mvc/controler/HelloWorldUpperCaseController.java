package com.nauka.spring5.mvc.controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/upperCase")
@Controller
public class HelloWorldUpperCaseController {

	//metoda kontrolera do wyswietlania formularza
	@RequestMapping("/showForm")
	public String showFormUpperCase() {
		return "upperCase/helloFormUpper";
	}

	//metoda pobiera dane z formularza, zmienia je po czym dodaje do modelu
	@RequestMapping("/processForm")
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
		return "upperCase/helloUpper";
	}
}