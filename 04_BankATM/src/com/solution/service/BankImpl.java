package com.solution.service;

public class BankImpl implements IBank {
	int balance;
	
	public BankImpl(int balance){
		this.balance = balance;
	}
	
	@Override
	public void balanceCheck() {
		System.out.println("Your Current Balance is: "+balance);
	}

	@Override
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("Your total balance is: "+balance);
	}

	@Override
	public void withdrawn(int amount) {
		this.balance -= amount;
		System.out.println("Your remaining balance is: "+balance);
	}

	@Override
	public void send(int amount) {
		if(amount >= this.balance) {
			System.out.println("Your balance is not enough");
		}
		else {
			this.balance -= amount;
			System.out.println("Your account is debited for Rs. "+amount);
			System.out.println("Your remaining balance is: "+balance);
		}
		
	}

}
