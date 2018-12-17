package com.jp.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.poc.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
