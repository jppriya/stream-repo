package com.jp.poc;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;
import com.jp.poc.model.College;
@Component
public class JsonPathExample {
	
	@Autowired
	private ResourceLoader loader;

	public  String readJsonFile() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		College college = objectMapper.readValue(loader.getResource("classpath:/College.json").getFile(), College.class);
		String collegeString = objectMapper.writeValueAsString(college);
		return collegeString;
	}

	public  Map<String, Object>  readWholeJson() throws JsonParseException, JsonMappingException, IOException {
		//This will give the whole json as the response
		return JsonPath.read(readJsonFile(), "$");
	}
	
	public  List<Map<String, Object>>  readAllValues() throws JsonParseException, JsonMappingException, IOException {
		/*	 	$.* -> Will give all the values in the json. it will not give JSON structure
		 		$..* -> Will give all the values in the json. it will give values in the JSON structure
		 */
		return JsonPath.read(readJsonFile(), "$.*");
	}

	public List<Map<String, Object>> readAllDepartments()  throws JsonParseException, JsonMappingException, IOException {
		return JsonPath.read(readJsonFile(), "$.courses[*].departments.*");
	}
	
	public List<Map<String, Object>> readAllStudents()  throws JsonParseException, JsonMappingException, IOException {
		return JsonPath.read(readJsonFile(), "$..students.*");
	}
	
	public List<Map<String, Object>> readAllAddress()  throws JsonParseException, JsonMappingException, IOException {
		return JsonPath.read(readJsonFile(), "$.courses[*].departments[*].students[*].address");
	}
	
	public List<Map<String, Object>> readLastStudent()  throws JsonParseException, JsonMappingException, IOException {
		/*		
		 * 		Find the last student in the list
		 * 		$.courses[*].departments[*].students[(@.length-1)]
				$.courses[*].departments[*].students[-1:]
		*/
		
		/*		Find the first two books
		 * 		$..book[0,1]
				$..book[:2]
				
				Find the First two sudents
				$.courses[*].departments[*].students[:2]
		*/			
		return JsonPath.read(readJsonFile(), "$.courses[*].departments[*].students[-1:]");
	}
}
