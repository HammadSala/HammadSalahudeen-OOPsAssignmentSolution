package com.gradedassignment1.javaoops.departments;

//Defining TechDepartment class which extends SuperDepartment
public class TechDepartment extends SuperDepartment {

	String returnString;

	// declaration of TechDepartment class methods, which accepts no parameter and return string
	public String departmentName() {
		returnString = "Welcome to Tech Department  ";
		return returnString;
	}

	public String getTodaysWork() {
		returnString = "Complete coding of Module 1 ";
		return returnString;
	}

	public String getWorkDeadline() {
		returnString = "Complete by EOD  ";
		return returnString;
	}

	public String getTechStackInformation() {
		returnString = "core Java  ";
		return returnString;
	}

}
