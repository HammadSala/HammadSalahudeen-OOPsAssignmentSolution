package com.gradedassignment1.javaoops.departments;

//Defining AdminDepartment class which extends SuperDepartment
public class AdminDepartment extends SuperDepartment {

	String returnString;

	// declaration of AdminDepartment class methods, which accepts no parameter and return String
	public String departmentName() {
		returnString = "Welcome to Admin Department ";
		return returnString;
	}

	public String getTodaysWork() {
		returnString = "Complete your documents Submission ";
		return returnString;
	}

	public String getWorkDeadline() {
		returnString = "Complete by EOD  ";
		return returnString;
	}

}
