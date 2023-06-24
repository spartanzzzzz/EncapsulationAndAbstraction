package com.obsqura.training.abstraction;

public class Contractor extends Employee {
	private int workingHours;
	private double paymentPerHour;

	
	public Contractor(int workingHours, double paymentPerHour) {
		this.workingHours = workingHours;
		this.paymentPerHour = paymentPerHour;
	}


	public double calculateSalary() {
		return paymentPerHour * workingHours;
	}

}
