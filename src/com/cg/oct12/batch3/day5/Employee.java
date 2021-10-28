package com.cg.oct12.batch3.day5;

//Encapsulation - 
//bind data members with methods 
//to secure data 
//make fields as private 
//make public methods to access those fields 

//foe entity classes, always -
//create private fields
//generate default constructor, full-parameterized constructor, getter-setter and toString

public class Employee {
	
	 private int empid;
	 private String firstname;
	 private double salary = 8000; // read-only + writable field
	 
	public Employee() {
		super();
	}
	
	public Employee(int empid, String firstname, double salary) {
		super();
		this.empid = empid;
		this.firstname = firstname;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstname=" + firstname + ", salary=" + salary + "]";
	}
	
	 
	 
	 
	 
	 
	 
	


}
