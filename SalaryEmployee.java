package com.test.bll;

public class SalaryEmployee extends Employee{
	private int week;
	private double spweek;
	private String name;
	private String job;
	
	public SalaryEmployee() {  // default constructor
		
	}
	
	public SalaryEmployee(int week, double spweek) { //value passed in constructor
		this.week= week;
		this.spweek= spweek;
	}
	
	public int getWeek() {       //get method of week
		return week;
	}
	
	public void setWeek(int week) {   //set method of week
		this.week=week;
	}
	
	public double getSalaryPerWeek() {  //get method of salary per week
		return spweek;
	}
	
	public void setSalaryPerWeek(double spweek) {   //set method of salary per week
		this.spweek=spweek;
	}
	
	@Override
	public void setName(String name) {     //override setName method
		this.name= name;
	}
	
	@Override
	public void setJob(String job) {      //override setJob method
		this.job=job;
	}

	@Override
	public void calculatePay() {          //abstract method of abstract class to compute total salary
		this.setSalary(week*spweek);
	}
	
	@Override
	public String toString() {       //toString method
		return " name : " +name+ ", job : " +job+ ", week : "+week+ ", salary per week : "+spweek;
	}
	

}

