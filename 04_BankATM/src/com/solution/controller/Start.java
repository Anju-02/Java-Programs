package com.solution.controller;

import java.util.Scanner;

import com.solution.service.BankImpl;

public class Start {
	
	public void startAtm() {
		System.out.println("***** Welcome To BOI Bank ATM *****");
		System.out.println("Select your option  \n1.balanceCheck \n2.deposit \n3.withdrawn \n4.send \n5.Exit");
		System.out.println("Enter your option:: ");
		
		int option;
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		
		BankImpl boi = new BankImpl(10000);
		
		switch(option) {
		case 1:boi.balanceCheck();
				break;
		case 2:System.out.println("Enter Amount: ");
				int amount = sc.nextInt();
				boi.deposit(amount);
				break;
		case 3:System.out.println("Enter Amount: ");
				int amount1 = sc.nextInt();
				boi.withdrawn(amount1);
				break;
		case 4:System.out.println("Enter Amount: ");
				int amount2 = sc.nextInt();
				boi.send(amount2);
				break;
		case 5:System.out.println("Thank you for using our bank ATM");
				break;
		default:System.out.println("Invalid option!! Please try again");
		}
		
	}
}
