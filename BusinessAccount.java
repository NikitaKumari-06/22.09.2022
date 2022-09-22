package com.test.bll;

public class BusinessAccount implements BankAccount {
	private double balance;
		
	
	public BusinessAccount() {  //default constructor
		super();
	}
	
	public BusinessAccount(double balance) {   //constructor passed with value
		super();
		this.balance = balance;
	}
	
	//abstract method of interface BankAccount
	
	@Override
	public double getBalance() {
		return balance;
	}
	
	@Override
	public void deposit(double amount) {
		if(amount > 2500000) {
			balance += amount * (1.001);
		}
		else
			balance += amount;
	}
	
	@Override
	public boolean withdraw(double amount) {
		if((balance + 25000) >= amount) {
			balance -= amount;
			return true;
		}
		
		return false;
	}
}
