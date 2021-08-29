package com.greatlearning.service;
import java.util.Scanner;
import com.greatlearning.model.Employee;

public class DriverClass {
	
	String employeeEmail, employeePassword;
	
	// create an object of Employee class
	Employee employee = new Employee("Parveen", "Nara");
	
	// create an object of CredentialService class
	CredentialService cs = new CredentialService();
	
	// method to show the generated email and password
	void generateOutput(String Department) {
		employeeEmail = cs.generateEmailAddress(employee, Department);
		employeePassword = cs.generatePassword();
		cs.showCredentials(employee, employeeEmail, employeePassword);
	}
	
	public static void main(String[] args) {
		// declare a variable selection to store user input		
		int selection;
		
		// create an object of the scanner class to take the input from the user
		Scanner sc = new Scanner(System.in);
		
		// display the options to the user
		System.out.println("Please enter the Department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		// Store the user input in the selection variable
		selection = sc.nextInt();
		
		// create an object of the driver class to call the non static method generateOutput
		DriverClass dc = new DriverClass();
		
		// display the output as per the user's input
		if (selection==1) {
			dc.generateOutput("tech");
		}
		else if (selection==2) {
			dc.generateOutput("admin");
		}
		else if (selection==3) {
			dc.generateOutput("hr");
		}
		else if (selection==4) {
			dc.generateOutput("legal");
		}
		else
			System.out.println("Please enter a valid number for the Department selection");
		
		sc.close();
	}

}
