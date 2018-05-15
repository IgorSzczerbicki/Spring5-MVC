package com.nauka.spring5.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/requestParam")
@Controller
public class HelloWorldRequestParamController {
	//metoda kontrolera do wyswietlania formularza
	@RequestMapping("/showForm")
	public String showFormRequestParam() {
		return "requestParam/helloFormRequestParam";
	}
	//metoda pobiera dane z formularza, zmienia je po czym dodaje do modelu
	@RequestMapping("/processForm")
	public String processFormRequestParam(@RequestParam("name") String theName, Model model) {

		//zamiana na duze litery
		theName = theName.toUpperCase();

		//stworzenie wiadomosci wynikowej
		String result = "Hej " + theName;

		//dodanie wyniku do modelu
		model.addAttribute("message", result);

		//zwrocenie nazwy widoku
		return "requestParam/helloRequestParam";
	}
}