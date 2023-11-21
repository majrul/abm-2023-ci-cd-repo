package com.abm.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abm.entity.Student;
import com.abm.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/add-student")
	public String add(Student student, Map model) {
		studentRepository.save(student);
		model.put("message", "Record added successfully!");
		return "index.jsp";
	}

	@RequestMapping("/view-students")
	public String add(Map model) {
		List<Student> list = studentRepository.findAll();
		model.put("students", list);
		return "viewStudents.jsp";
	}

	@RequestMapping("/delete-student")
	public String delete(@RequestParam int rollno, Map model) {
		studentRepository.deleteById(rollno);
		model.put("message", "Record Deleted successfully!");
		return "index.jsp";
	}
	
	@RequestMapping("/edit-student")
	public String edit(@RequestParam int rollno, Map model) {
		Student student = studentRepository.findById(rollno).get();
		model.put("student", student);
		return "editStudent.jsp";
	}
	
	@RequestMapping("/update-student")
	public String update(Student student, Map model) {
		studentRepository.save(student);
		model.put("message", "Record updated successfully!");
		return "index.jsp";
	}
}












