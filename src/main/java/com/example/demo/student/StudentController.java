package com.example.demo.student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

	private final StudentService stuService;
	
	@GetMapping
	public String addStudent(Model model) {
		model.addAttribute("student", new Student());		
		return "student";
	}
	@PostMapping("/add")
	public String addStudent(Student student) {
		stuService.addStudent(student);
		return "student";
	}
	@GetMapping("/view")
	public String viewAllStudent(Model model){
		model.addAttribute("students", stuService.viewAllStudent());
		return "students";
	}
	
	@GetMapping("/view/{id}")
	public String viewStudentById(@PathVariable("id")Long id, Model model) {
		model.addAttribute("student",stuService.viewStudentById(id));
		return "student";
	}
	
	@PostMapping("/update")
	public String updateStudent(Student student) {
		
		if(student == null) {
			System.out.println("Student not found.");
			return "redirect:/students/view";
		}
		stuService.updateStudent(student);
		return "redirect:/students/view";
	}
	
	@PostMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") Long id) {
		stuService.deleteStudent(id);
		return "redirect:/students/view";
	}
}








