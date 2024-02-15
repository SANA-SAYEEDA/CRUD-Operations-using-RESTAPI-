package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	//	public StudentService(StudentRepository studentRepository) {
	//		super();
	//		this.studentRepository = studentRepository;
	//	}

	public List<Student> getStudent() {
		return studentRepository.findAll();
	}

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student updateStudent(Student student) {
		return	studentRepository.save(student);
	}

		public String deleteStudent(Integer id) {
			studentRepository.deleteById(id);
			return "done";
		}

		public String updateStudentById(Integer id, Student updatingStudent) {
			//Get the record from the database 
			Optional<Student> existingStudent = studentRepository.findById(id);
			if(existingStudent.isPresent()) {
			//modify in application layer
			Student student = existingStudent.get();
			//String name=updatingStudent.getName();
			student.setName(updatingStudent.getName());//setName(name);
			//save the updated record
			studentRepository.save(student);
			return "Update Record";
			}
			else {
				return "Record not found!";
			}
			
		}

}
