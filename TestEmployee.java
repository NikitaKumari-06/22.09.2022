package com.test.pll;
import com.test.bll.Employee;
import com.test.bll.HourlyEmployee;
import com.test.bll.SalaryEmployee;


public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new HourlyEmployee(6,1000);
		e1.calculatePay();     //calculate total salary of HourlyEmployee class
		
		System.out.println("HourlyEmployee...");
		e1.setName("Devsena");
		e1.setJobTitle("Programmer");
		System.out.println(e1);   //print all the details of HourlyEmployee
		
		System.out.println("***************************");
		
		Employee e2 = new SalaryEmployee(3000);
		e2.calculatePay();    //calculate total salary of SalaryEmployee
		e2.setName("Bahubali");
		e2.setJobTitle("Accountant");
		System.out.println(e2);   //print all the details of class SalaryEmployee
		
	}

}
