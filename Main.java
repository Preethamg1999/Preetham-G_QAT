package com.Interface;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount c= new CurrentAccount();
		SavingsAccount s=new SavingsAccount();
		c.validateUser();
		c.AccountType();
		c.checkBankBalance();
		s.validateUser();
		s.AccountType();
		s.checkBankBalance();
		
		
	}

}
