package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao  extends JpaRepository<Student, Long>{

	
}
