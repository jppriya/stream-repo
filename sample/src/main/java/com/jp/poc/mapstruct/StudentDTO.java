package com.jp.poc.mapstruct;

import java.util.Date;

public class StudentDTO {

	private String studentName;
	private String age;
	private Date dob;
	private DepartmentDTO dept;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public DepartmentDTO getDept() {
		return dept;
	}

	public void setDept(DepartmentDTO dept) {
		this.dept = dept;
	}
}
