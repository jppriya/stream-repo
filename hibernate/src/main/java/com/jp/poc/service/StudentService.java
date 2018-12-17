package com.jp.poc.service;

import java.util.List;

import com.jp.poc.model.College;
import com.jp.poc.model.Course;
import com.jp.poc.model.Department;
import com.jp.poc.model.Student;

public interface StudentService {

	Department save(Department department);
	
	Course save(Course course);

	College save(College college);
	
	College updateCollegeByName(String oldName, String newName);

	List<College> save(List<College> college);
	
	Student delete(String name);
	
}
