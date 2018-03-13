package com.jp.poc.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details of the user")
public class User {

	@ApiModelProperty(notes = "Id of the user")
	private Integer userId;

	@ApiModelProperty(notes = "Name of the user")
	private String userName;

	@ApiModelProperty(notes = "Address of the user")
	private String address;

	public User(Integer userId, String userName, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.address = address;
	}

	public User() {
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
