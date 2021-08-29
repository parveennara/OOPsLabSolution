package com.greatlearning.model;

public class Employee {
	
	private String firstName, lastName;
	
	// parameterized constructor to store employee's firstName and lastName
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// getter method to return employee's firstName
	public String getFirstName() {
		return firstName;
	}
	
	// setter method to set employee's firstName
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// getter method to return employee's lastName
	public String getLastName() {
		return lastName;
	}
	
	// setter method to set employee's lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
