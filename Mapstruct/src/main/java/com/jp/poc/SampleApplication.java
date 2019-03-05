package com.jp.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jp.poc.mapstruct.Department;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
		final Department dept= new Department();
		dept.setDeptId("1"); // we can change the properties. Only in immutable, we can not change the properties
//		dept = new Department(); // not possible to re initialize
	
		
		final String s =new String("Jaya");
		s.replace("a", "b");
//		s ="pre"; // final var can not be re-initialzed or re-assigned
	}
}
