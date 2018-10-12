package com.jp.poc.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jp.poc.jackson.model.Address;
import com.jp.poc.jackson.model.Employee;

public class JacksonAnnotations {

	public static void main(String[] args) throws IOException {
		JacksonAnnotations jackson = new JacksonAnnotations();
		Employee employee = jackson.getEmployee();
		String serializedResponse = jackson.serialization(employee);
		
		System.out.println("Serialized Response: " + serializedResponse);
		Employee deSerializedResponse = jackson.deSerialization("{\"firstName\":\"JP\",\"lastName\":\"R\",\"age\":23,\"gender\":\"Female\",\"address\":{\"streetAddress\":null,\"city\":\"STAMFORD\",\"state\":\"CT\",\"zip\":\"06905\",\"country\":\"FAIRFIELD\"},\"monthlyIncome\":40200.5,\"selfEmployed\":\"N\"}");
	
		System.out.println("DeSerialized Response: " + deSerializedResponse);
	}

	private Employee getEmployee() {
		Employee employee = new Employee();
		Address address = new Address();
		address.setCity("STAMFORD");
		address.setCountry("FAIRFIELD");
		address.setState("CT");
		address.setZip("06905");
		employee.setAddress(address);
		employee.setAge(23);
		employee.setFirstName("JP");
		employee.setLastName("R");
		employee.setGender("Female");
		employee.setPhoneNumbers(new String[] { "1234678905" });
		employee.setEmployeeId(2);
		employee.setIncome(40200.50);
		employee.setSelfEmployed(true);
		return employee;
	}

	private String serialization(Employee employee) throws JsonProcessingException {
		/*
		 * ObjectMapper used for reading and writing JSON, either to and from
		 * basic POJOs(i.e model) (Plain Old Java Objects), or to and from a
		 * general JSON
		 */
		ObjectMapper objectMapper = new ObjectMapper();
		/*
		 * converting bean to json String Serialization = model to json
		 */
		return objectMapper.writeValueAsString(employee);

	}

	private Employee deSerialization(String serializedReq)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		/*
		 * converting json string to corresponding Type DeSerialization = json
		 * to Model
		 */
		return objectMapper.readValue(serializedReq, Employee.class);
	}
}
