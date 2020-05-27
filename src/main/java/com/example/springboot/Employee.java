package com.example.springboot;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	private Long employeeId;

	@Column(name = "FIRST_NAME")
	private String firstName;

	private String lastName;

	private String address;

	public Employee() {

	}

	public Employee(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Employee(Long employeeId, String firstName, String lastName, String address) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public Long getEmployeeId() {
		return (long) employeeId;
	}

	public void setEmployeeId(Long employeeId) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		Employee empObj = (Employee) obj;
		return (this.employeeId == empObj.employeeId);
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.employeeId);
		return hash;
	}

	public void validate() {

	}

}
