package com.example.demo.student;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

	private final StudentDao studentDao;
	
	@Override
	public Student addStudent(Student student) {
		return studentDao.save(student);		
	}
	
	@Override
	public List<Student> viewAllStudent() {
		return studentDao.findAll();
	} 
	
	@Override
	public Optional<Student> viewStudentById(Long id) {
		return studentDao.findById(id);
	}
	
	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}
	
	@Override
	public void deleteStudent(Long id) {
		studentDao.deleteById(id);
	}	
	
}
