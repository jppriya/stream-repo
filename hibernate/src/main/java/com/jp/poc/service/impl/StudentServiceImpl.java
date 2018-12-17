package com.jp.poc.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.poc.model.College;
import com.jp.poc.model.Course;
import com.jp.poc.model.Department;
import com.jp.poc.model.Student;
import com.jp.poc.repository.CollegeRepository;
import com.jp.poc.repository.CourseRepository;
import com.jp.poc.repository.DepartmentRepository;
import com.jp.poc.repository.StudentRepository;
import com.jp.poc.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	private static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private CollegeRepository collegeRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public Department save(Department department) {
		Department savedStudent = departmentRepository.save(department);
		return savedStudent;
	}

	@Override
	public Course save(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public College save(College college) {
		return collegeRepository.save(college);
	}

	@Override
	public List<College> save(List<College> college) {
		return collegeRepository.saveAll(college);
	}

	public College getCollegeByName(String name) {
		return collegeRepository.findByName(name);
	}

	@Override
	public College updateCollegeByName(String oldName, String newName) {
		if (collegeRepository.updateByName(oldName, newName) >= 1) {
			return getCollegeByName(newName);
		}
		return null;
	}

	public Integer getCountOfStudents() {
		return (int) studentRepository.count();
	}

	@Override
	public Student delete(String name) {
		LOGGER.info("Before Delete {}", getCountOfStudents());
		Student deleteByName = studentRepository.deleteByName(name).get(0);
		LOGGER.info("After Delete {}", getCountOfStudents());
		return deleteByName;
	}

}
