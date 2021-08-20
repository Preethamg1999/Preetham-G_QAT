package com.Interface;

public class SavingsAccount implements BankAccount{
	private String b= "Savings Account";
	public void AccountType(){
		System.out.println("This is "+b);
		
	}
	public void checkBankBalance(){
		System.out.println("The balance is Rs.99999999");
	}
	public void validateUser(){
		System.out.println("User is valid");
	}
}
