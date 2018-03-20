package com.jp.poc.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jp.poc.jackson.model.Address;
import com.jp.poc.jackson.model.User;

/**
 * Jackson Processing Basics
 *
 */
public class JacksonProcessing {

	public static void main(String[] args) throws IOException {
		JacksonProcessing jackson = new JacksonProcessing();
		User user = jackson.getUser();
		String serializedResponse = jackson.serialization(user);
		/*
		 * Serialized Response:
		 * {"userId":2,"firstName":"JP","lastName":"R","age":23,"gender":
		 * "Female","phoneNumbers":["1234678905"],"address":{"streetAddress":
		 * null,"city":"STAMFORD","state":"CT","zip":"06905","country":
		 * "FAIRFIELD"}}
		 */
		System.out.println("Serialized Response: " + serializedResponse);
		User deSerializedResponse = jackson.deSerialization(serializedResponse);
		/*
		 * DeSerialized Response: User [userId=2, firstName=JP, lastName=R,
		 * age=23, gender=Female, phoneNumbers=[1234678905], address=Address
		 * [streetAddress=null, city=STAMFORD, state=CT, zip=06905,
		 * country=FAIRFIELD]]
		 */
		System.out.println("DeSerialized Response: " + deSerializedResponse);
		User deSerializationUsingFile = jackson.deSerializationUsingFile();
		/*
		 * DeSerialized Response using Files: User [userId=1, firstName=John,
		 * lastName=Smith, age=23, gender=Male, phoneNumbers=[9876543210,
		 * 4564456466], address=Address [streetAddress=PERIMETER PKWY NW STE 15,
		 * city=HUNTSVILLE, state=AL, zip=35806, country=United States]]
		 */
		System.out.println("DeSerialized Response using Files: " + deSerializationUsingFile);
		String serializedResponseUsingFile = jackson.serialization(deSerializationUsingFile);
		/*
		 * Serialized Response:
		 * {"userId":1,"firstName":"John","lastName":"Smith","age":23,"gender":
		 * "Male","phoneNumbers":["9876543210","4564456466"],"address":{
		 * "streetAddress":"PERIMETER PKWY NW STE 15","city":"HUNTSVILLE",
		 * "state":"AL","zip":"35806","country":"United States"}}
		 */
		System.out.println("Serialized Response: " + serializedResponseUsingFile);
	}

	private String serialization(User user) throws JsonProcessingException {
		/*
		 * ObjectMapper used for reading and writing JSON, either to and from
		 * basic POJOs(i.e model) (Plain Old Java Objects), or to and from a
		 * general JSON
		 */
		ObjectMapper objectMapper = new ObjectMapper();
		/*
		 * converting bean to json String Serialization = model to json
		 */
		return objectMapper.writeValueAsString(user);

	}

	private User getUser() {
		User user = new User();
		Address address = new Address();
		address.setCity("STAMFORD");
		address.setCountry("FAIRFIELD");
		address.setState("CT");
		address.setZip("06905");
		user.setAddress(address);
		user.setAge(23);
		user.setFirstName("JP");
		user.setLastName("R");
		user.setGender("Female");
		user.setPhoneNumbers(new String[] { "1234678905" });
		user.setUserId(2);
		return user;
	}

	private User deSerialization(String serializedReq) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		/*
		 * converting json string to corresponding Type DeSerialization = json
		 * to Model
		 */
		return objectMapper.readValue(serializedReq, User.class);
	}

	private User deSerializationUsingFile() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		/* converting json string by reading file to corresponding Type */
		return objectMapper.readValue(new File("User.json"), User.class);
	}
}
