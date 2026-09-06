package com.example.demo.student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

	Student addStudent(Student student);
	List<Student> viewAllStudent();
	Optional<Student> viewStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudent(Long id);
}
