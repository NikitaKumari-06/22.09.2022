package com.test.bll;

public class HourlyEmployee extends Employee {
	private int hour;
	private double pphour;
	private String name;
	private String job;
	
	public HourlyEmployee() {    // default constructor
		
	}
	
	public HourlyEmployee(int hour, double pphour) {    //value passed in constructor
		this.hour = hour;
		this.pphour = pphour;
	}
	
	public int getHour() {    //get method of hour
		return hour;
	}
	
	public void setHour(int hour) {  //set method of hour
		this.hour = hour;
	}
	
	public double getPayPerHour() {  //get method of pay per hour
		return pphour;
	}
	
	public void setPayPerHour(double pphour) {   //set method of pay per hour
		this.pphour=pphour;
	}
	
	@Override
	public void setName(String name) {         //override setName method
		this.name= name;
	}
	
	@Override
	public void setJob(String job) {         //override setJob method
		this.job=job;
	}
	
	@Override
	public void calculatePay() {            //abstract method of abstract class to compute salary
		this.setSalary(hour*pphour);
	}
	
	@Override
	public String toString() {             //toString method
		return " name : " +name+ ", job : " +job+ ", hour : "+hour+ ", pay per hour : "+pphour;
	}
	
 
}

