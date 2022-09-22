package com.test.bll;

public abstract class Employee {
	private String name;
	private String job;
	
	public Employee() {    //Default constructor
		
	}
	
	public Employee(String name, String job) { // parametrized constructor
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
	
	public void setJobTitle(String job) {   //set method of jobtitle
		this.job=job;
	}
	
	public abstract double calculatePay();  //abstract method
	
	@Override
	public String toString() {
		return "Employee [Name=" + name + ", Job Title=" + job + "]";
	} 
	
}

