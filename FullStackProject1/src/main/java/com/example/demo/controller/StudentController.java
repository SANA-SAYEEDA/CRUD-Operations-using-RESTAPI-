package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.serviceimpl.StudentServiceImpl;

@RestController
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;

//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}

	@GetMapping("/get")
	public List<Student> getStudent() {
		return studentServiceImpl.getStudent();
	}
	@PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentServiceImpl.createStudent(student);
    }
	@PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentServiceImpl.updateStudent(student);
    }
	@DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        return studentServiceImpl.deleteStudent(id);
    }
	//update student by Id
	@PutMapping("/put/{id}")
    public String updateStudentById(@PathVariable Integer id, @RequestBody Student student) {
        return studentServiceImpl.updateStudentById(id, student);
    }
}
