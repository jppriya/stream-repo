package com.jp.poc;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;



/**
 * @author jayapriya.r
 * 
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.jp.poc"})
@RestController
public class JsonPathApplication {

	@Autowired
	JsonPathExample jsonPathExample;
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(JsonPathApplication.class, args);
	}
	
	@GetMapping("/jsonPath/full")
	public Map<String, Object> readWholeJson() throws JsonParseException, JsonMappingException, IOException {
		return jsonPathExample.readWholeJson();	
	}
	
	@GetMapping("/jsonPath/values")
	public List<Map<String, Object>> readAllValues() throws JsonParseException, JsonMappingException, IOException {
		return jsonPathExample.readAllValues();	
	}
	
	@GetMapping("/jsonPath/students")
	public List<Map<String, Object>> readAllStudents() throws JsonParseException, JsonMappingException, IOException {
		return jsonPathExample.readAllStudents();	
	}
	
	@GetMapping("/jsonPath/departments")
	public List<Map<String, Object>> readAllDepartments() throws JsonParseException, JsonMappingException, IOException {
		return jsonPathExample.readAllDepartments();	
	}
	
	@GetMapping("/jsonPath/addresses")
	public List<Map<String, Object>> readAllAddress() throws JsonParseException, JsonMappingException, IOException {
		return jsonPathExample.readAllAddress();	
	}
	
	
	@GetMapping("/jsonPath/students/last")
	public List<Map<String, Object>> readLastStudent() throws JsonParseException, JsonMappingException, IOException {
		return jsonPathExample.readLastStudent();	
	}
}
