package com.wipro.inheritance;

public class TestEmployee {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Sanjana");
		emp.setYearOfWorkStarted(2017);
		emp.setAnnualSalary(4.2);
		emp.setNationalInsuranceNumber("BQ11SY987");
		emp.getEmployeedetails();
	}
}
