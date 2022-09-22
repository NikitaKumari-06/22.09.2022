package com.test.bll;

public class SalaryEmployee extends Employee{
	private double salaryperweek;
	
	public SalaryEmployee() {  // default constructor
		super();
	}
	
	public SalaryEmployee( double salaryperweek) { //parametrized constructor
	    super();
		this.salaryperweek= salaryperweek;
	}
	
	public double getSalaryPerWeek() {  //get method of salary per week
		return salaryperweek;
	}
	
	public void setSalaryPerWeek(double salaryperweek) {   //set method of salary per week
		this.salaryperweek=salaryperweek;
	}
	

	@Override
	public double calculatePay() {          //abstract method of abstract class to compute total salary
	  return salaryperweek;
	}
	
	@Override
	public String toString() {       //toString method
		return " name : " +getName()+ ", job : " +getJob()+   ", salary per week : "+salaryperweek+ ", total salary : " +calculatePay();
	}
	
}

