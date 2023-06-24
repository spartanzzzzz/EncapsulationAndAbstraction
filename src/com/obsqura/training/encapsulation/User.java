package com.obsqura.training.encapsulation;

public class User {
	
public static int getUserPin() {
		return 1001;
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setPin(1001);
		int enteredPin =  getUserPin();
		if(bank.validatePin(enteredPin)) {
			System.out.println("Valid Pin. You can proceed with withdrawal");
		}else {
			System.out.println("Invalid Pin");
		}
			
	}
	
}
