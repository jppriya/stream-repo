package com.jp.poc.jackson.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * @author jayapriya.r
 *
 */
@JsonIgnoreProperties(value = { "phoneNumbers" },ignoreUnknown=true)
public class Employee {

	@JsonIgnore
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private Integer age;
	private String gender;
	private String[] phoneNumbers;
	private Address address;
	private Double income;

	public Employee() {

	}

	/**
	 * @param employeeId
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gender
	 * @param phoneNumbers
	 * @param address
	 * @param income
	 */
	public Employee(Integer employeeId, String firstName, String lastName, Integer age, String gender,
			String[] phoneNumbers, Address address, Double income) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.phoneNumbers = phoneNumbers;
		this.address = address;
		this.income = income;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String[] phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	//@JsonGetter("monthlyIncome")
	public Double getIncome() {
		return income;
	}

	@JsonSetter("monthlySalary")
	public void setIncome(Double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", gender=" + gender + ", phoneNumbers=" + Arrays.toString(phoneNumbers) + ", address="
				+ address + ", income=" + income + "]";
	}


}
