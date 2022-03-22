package com.gradedassignment1.javaoops.departments;

//Defining HrDepartment class which extends SuperDepartment
public class HrDepartment extends SuperDepartment {

	String returnString;

	// declaration of HrDepartment class methods, which accepts no parameter and return String
	public String departmentName() {
		returnString = "Welcome to Hr Department ";
		return returnString;
	}

	public String getTodaysWork() {
		returnString = "Fill today’s worksheet and mark your attendance ";
		return returnString;
	}

	public String getWorkDeadline() {
		returnString = "Complete by EOD  ";
		return returnString;
	}

	public String doActivity() {
		returnString = "team Lunch  ";
		return returnString;
	}

}
