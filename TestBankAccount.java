package com.test.pll;
import com.test.bll.BankAccount;
import com.test.bll.SalaryAccount;
import com.test.bll.CurrentAccount;
import com.test.bll.BusinessAccount;


public class TestBankAccount {
	public static void main(String[] args) {
		
		BankAccount acc1 = null;
		
		System.out.println("1. Salary Account");
		System.out.println("***********************************");
		
		acc1 = new SalaryAccount(10000);
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(5000);
		
		System.out.println("After depositing the balance: " + acc1.getBalance());
		
		if(acc1.withdraw(6000)) {
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Withdrawal does not happened because insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());
		
		
		System.out.println("2. Current Account");
		System.out.println("***********************************");
		
		acc1 = new CurrentAccount(10000);
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(5000);
		
		System.out.println("After depositing the balance: " + acc1.getBalance());
		
		if(acc1.withdraw(9000)) {
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Withdrawal does not happened because insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());
		
		System.out.println("3. Business Account");
		System.out.println("***********************************");
		
		acc1 = new BusinessAccount(100000);
	
		
		System.out.println("Balance: " + acc1.getBalance());
		
		acc1.deposit(5000000);
		
		System.out.println("After depositing the balance: " + acc1.getBalance());
		
		
		if(acc1.withdraw(5130000)) {
			System.out.println("Withdrawal happened successfully.");
		}
		else {
			System.out.println("Withdrawal does not happened because insufficient balance.");
		}
		
		System.out.println("After withdrawing the balance: " + acc1.getBalance());
		
	}


}
