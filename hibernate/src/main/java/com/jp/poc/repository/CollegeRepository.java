package com.jp.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jp.poc.model.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

	public College findByName(String name);

	@Modifying
	@Query("update College c set c.name=:newName where c.name=:oldName")
	public Integer updateByName(@Param(value = "oldName") String oldName, @Param(value = "newName") String newName);
}
