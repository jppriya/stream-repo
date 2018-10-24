
package com.jp.poc.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

	@JsonProperty("name")
	private String name;
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("address")
	private Address address;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("address")
	public Address getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(Address address) {
		this.address = address;
	}

}
