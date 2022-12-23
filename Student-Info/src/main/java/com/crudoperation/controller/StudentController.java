package com.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crudoperation.entity.Student;
import com.crudoperation.service.StudentService;


@Controller 
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	

	@GetMapping("/")
	public String home(Model m)
	{
		List<Student> stud=studentService.getAllStudent();
		m.addAttribute("stud",stud);
		return "index";
	}
	
	@GetMapping("/addstud")
	public String addStudForm()
	{
		return "add-stud";
	}
	
	@PostMapping("/register")
	public String registerStudent(@ModelAttribute Student stud)
	{
		studentService.addStudent(stud);
	
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m)
	{
		Student stud=studentService.getById(id);
		m.addAttribute("stud",stud);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updateStudent(@ModelAttribute Student stud)
	{
		studentService.addStudent(stud);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentService.deleteById(id);
		return "redirect:/";
	}
}
