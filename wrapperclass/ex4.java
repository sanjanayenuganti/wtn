package com.wipro.wrapperclass;
class Employee implements Cloneable
{
	String name;
	double salary;
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	Employee cloneObject() throws CloneNotSupportedException
	{
		return (Employee)super.clone();
	}
	@Override
	public String toString()
	{
		return "Employee Name: "+name+"\n"+"Employee Salary: "+salary;
	}
}
public class ex4 {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Employee employeeobjecttwo;
		Employee employeeobjectone=new Employee("Sanjana",35000);
		System.out.println("Before cloning:");
		System.out.println(employeeobjectone.toString());
		employeeobjecttwo=employeeobjectone.cloneObject();
		employeeobjectone.name="Preethi";
		employeeobjectone.salary=50000;
		System.out.println("After cloning:");
		System.out.println("1st Employee details:"+"\n"+employeeobjectone.toString());
		System.out.println("2nd Employee details:"+"\n"+employeeobjecttwo.toString());
	}

}