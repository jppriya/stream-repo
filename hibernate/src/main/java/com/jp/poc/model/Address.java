
package com.jp.poc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Address {

	@Id
	@GeneratedValue
	@Column
	private Long addressId;
	
	@Column
    private String street;
	
	@Column
    private String city;
	
	@Column
    private String state;
	
	@Column
    private String country;
	
	@Column
    private String zipcode;


}
