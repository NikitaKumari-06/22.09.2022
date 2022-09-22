package com.test.bll;

public class SalaryAccount implements BankAccount {
private double balance;
	
	public SalaryAccount() {  //default constructor
		
	}
	
	public SalaryAccount(double balance) { //constructor with value
		this.balance = balance;
	}

	//abstract method of interface BankAccount
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}

}
