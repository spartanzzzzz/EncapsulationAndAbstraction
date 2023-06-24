package com.obsqura.training.abstraction;

public class FullTimeEmployee extends Employee {
	private double constantSalary = 100;
	
	public double calculateSalary() {
		return constantSalary * 8;
	}

}
