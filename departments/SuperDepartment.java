package com.gradedassignment1.javaoops.departments;

/*..
 * Declaring Super class SuperDepartment, which will be extended by other departments.
 * This class holds 4 methods which returns string and not accept any parameter
 * 
 */
public class SuperDepartment {

	String returnString;

	// declaration of super class methods, which accepts no parameter and return string
	public String departmentName() {
		returnString = "Super Department ";
		return returnString;
	}

	public String getTodaysWork() {
		returnString = "No Work as of now ";
		return returnString;
	}

	public String getWorkDeadline() {
		returnString = "Nil";
		return returnString;
	}

	// This function will be called by the extended class using their own object
	public String isTodayAHoliday() {
		returnString = "Today is not a holiday  ";
		return returnString;
	}

}
