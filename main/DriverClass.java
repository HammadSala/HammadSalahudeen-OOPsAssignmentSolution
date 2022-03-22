package com.gradedassignment1.javaoops.main;

//Included the package(departments) which contains other department class definition
import com.gradedassignment1.javaoops.departments.*;

//Driver class definition starts here
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating objects for create objects of HrDepartment, TechDepartment, AdminDepartment
		SuperDepartment adminDpt = new AdminDepartment();
		HrDepartment hrDpt = new HrDepartment();
		TechDepartment techDpt = new TechDepartment();

		// Displaying each departments functionalities in one place
		// Display the Holiday case by inherting the superclass defined function (isTodayAHoliday)
		System.out.println(adminDpt.departmentName());
		System.out.println(adminDpt.getTodaysWork());
		System.out.println(adminDpt.getWorkDeadline());
		System.out.println(adminDpt.isTodayAHoliday());
		System.out.println();

		System.out.println(hrDpt.departmentName());
		System.out.println(hrDpt.doActivity());
		System.out.println(hrDpt.getTodaysWork());
		System.out.println(hrDpt.getWorkDeadline());
		System.out.println(hrDpt.isTodayAHoliday());
		System.out.println();

		System.out.println(techDpt.departmentName());
		System.out.println(techDpt.getTodaysWork());
		System.out.println(techDpt.getWorkDeadline());
		System.out.println(techDpt.getTechStackInformation());
		System.out.println(techDpt.isTodayAHoliday());

	}

}
