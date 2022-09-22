package com.test.bll;

public abstract class Employee {
	private String name;
	private String job;
	private double salary;
	
	public Employee() {    //Default constructor
		
	}
	
	public Employee(String name, String job) { // Value passed in constructor
		this.name = name;
		this.job = job;
	}
	
	public String getName() {    //get method of name
		return name;
	}
	
	public void setName(String name) {  //set method of name
		this.name= name;
	}
	
	public String getJob() {     //get method of job
		return job;
	}
	
	public void setJob(String job) {   //set method of job
		this.job=job;
	}
	
	public abstract void calculatePay();  //abstract method
	
	public double getSalary() {          //get method of salary 
		return salary;
	}
	
	public void setSalary(double salary) {     //set method of salary
		this.salary=salary;
	}
	
 
	
}
