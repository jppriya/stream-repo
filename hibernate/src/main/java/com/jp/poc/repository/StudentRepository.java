package com.jp.poc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.poc.model.College;
import com.jp.poc.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	Long removeByName(String name);
	
	public College findByName(String name);

	List<Student> deleteByName(String name);

}
