package com.greatlearning.service;
import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {	
	
	// method to generate employee's email address
	public String generateEmailAddress(Employee employee, String department){
		
		return employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@" + department + ".xyz.com";
	}
	
	// method to generate employee's email password
	public String generatePassword(){
		int len = 12;
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String characters = "!@#$%^&*_=+-/.?<>)";
		
		String values = capital + small + numbers + characters;
		
		Random random = new Random();
		
		char[] password = new char[len];
		
		for (int i=0; i < len; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		
		return String.valueOf(password);
	}
	
	// // method to display employee's email credentials
	public void showCredentials(Employee employee, String employeeEmail, String employeePassword){
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    --> " + employeeEmail);
		System.out.println("Password --> " + employeePassword);
	}

}
