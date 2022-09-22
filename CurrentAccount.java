package com.test.bll;

public class CurrentAccount implements BankAccount{
private double balance;
	
	public CurrentAccount() { //default constructor
		
	}
	
	public CurrentAccount(double balance) {
		this.balance = balance;
	}
//Abstract method of interface
	
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
		if(balance -5000 >= amount) {
			balance -= amount;
			return true;
		}
		return false;
	}
}
