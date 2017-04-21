package com.classattendancemaster;

import com.classattendancemaster.Entities.Student;
import com.classattendancemaster.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ClassAttendanceMasterApplication {
	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ClassAttendanceMasterApplication.class, args);
	}

	@PostConstruct
	public void addRandomStudents(){

		studentRepository.save(new Student("Kondziu", "Gabara", "122077"));
		studentRepository.save(new Student("Adam", "Halicki", "116289"));

	}
}
