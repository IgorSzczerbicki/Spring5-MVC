package com.nauka.spring5.mvc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nauka.spring5.mvc.domain.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/new")
	public String newStudent(Model model) {
		//dodanie atrybutu klasy Student do modelu
		model.addAttribute("student", new Student());
		return "student/new";
	}
	
	@RequestMapping("/process")
	public String processStudent(@ModelAttribute("student") Student student) {
		System.out.println("New student: " + student.getSurname() + " " + student.getName());
		return "student/confirmation";
	}
}