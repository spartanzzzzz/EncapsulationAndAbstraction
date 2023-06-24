package com.obsqura.training.encapsulation;

public class Bank {
	private int pin;
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public boolean validatePin(int enteredPin) {
		
		return enteredPin==1001 || enteredPin==1234 || enteredPin==1212;
	}

}
