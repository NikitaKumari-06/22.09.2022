package com.test.pll;
import com.test.bll.Employee;
import com.test.bll.HourlyEmployee;
import com.test.bll.SalaryEmployee;


public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new HourlyEmployee(6,1000);
		e1.calculatePay();     //calculate total salary of HourlyEmployee class
		
		System.out.println("HourlyEmployee...");
		e1.setName("Devsena");
		e1.setJob("Programmer");
		System.out.println(e1.toString());   //print all the details of HourlyEmployee
		
		System.out.println("Salary : "+e1.getSalary()); //gives total salary of HourlyEmployee class
		
		System.out.println("***************************");
		
		Employee e2 = new SalaryEmployee(3,3000);
		e2.calculatePay();    //calculate total salary of SalaryEmployee
		e2.setName("Bahubali");
		e2.setJob("Accountant");
		System.out.println(e2.toString());   //print all the details of class SalaryEmployee
		
		
		System.out.println("WeeklySalary.....");
		
		System.out.println("Salary: "+e2.getSalary()); //gives total salary of SalaryEmployee
		
		
	}

}
