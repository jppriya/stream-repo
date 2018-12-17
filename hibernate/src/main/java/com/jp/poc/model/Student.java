
package com.jp.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Entity
@Data
public class Student {

	@Column(name = "NAME")
	@JsonProperty("name")
	private String name;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	@JsonProperty("id")
	private Long id;
	
	@Column(name="GENDER")
	@JsonProperty("gender")
	private String gender;
	
	/*@ManyToMany
	@JoinColumn()
	private Address address;*/
}
