package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	public List<Student> getStudent();
	public Student createStudent(Student student);
	public Student updateStudent(Student student);
	public String deleteStudent(Integer id);
}
