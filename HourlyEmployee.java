package com.test.bll;

public class HourlyEmployee extends Employee {
	private int hour;
	private double payperhour;
	
	public HourlyEmployee() {    // default constructor
		super();
	}
	
	public HourlyEmployee(int hour, double pphour) { //value passed in constructor
		super();
		this.hour = hour;
		this.payperhour = pphour;
	}
	
	public int getHour() {    //get method of hour
		return hour;
	}
	
	public void setHour(int hour) {  //set method of hour
		this.hour = hour;
	}
	
	public double getPayPerHour() {  //get method of pay per hour
		return payperhour;
	}
	
	public void setPayPerHour(double payperhour) {   //set method of pay per hour
		this.payperhour=payperhour;
	}
	
	@Override
	public double calculatePay() {            //abstract method of abstract class to compute salary
		return getHour()*getPayPerHour();
		
	}
	
	@Override
	public String toString() {             //toString method
		return " name : " +getName()+ ", job : " +getJob()+ ", hour : "+hour+ ", pay per hour : "+payperhour+ ", total salary: "+calculatePay();
		}
	
 
}



