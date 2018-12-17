package com.jp.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.poc.model.College;
import com.jp.poc.model.Course;
import com.jp.poc.model.Department;
import com.jp.poc.model.Student;
import com.jp.poc.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentResource {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/status")
	public String getStatus() {
		return "SUCCESS";
	}
	
	@PostMapping("/department")
	public Department save(@RequestBody Department department) {
		return studentService.save(department);
	}
	
	@PostMapping("/courses")
	public Course save(@RequestBody Course course) {
		return studentService.save(course);
	}
	
	@PostMapping("/college")
	public College save(@RequestBody College college) {
		return studentService.save(college);
	}

	@PostMapping("/college/all")
	public List<College> save(@RequestBody List<College> college) {
		return studentService.save(college);
	}

	@PutMapping("/college/{oldname}/{newname}")
	public College save(@PathVariable("oldname") String oldName, @PathVariable("newname") String newName) {
		return studentService.updateCollegeByName(oldName, newName);
	}
	
	@DeleteMapping("/student/{name}")
	Student delete(@PathVariable("name") String name) {
		return studentService.delete(name);
	}
}
