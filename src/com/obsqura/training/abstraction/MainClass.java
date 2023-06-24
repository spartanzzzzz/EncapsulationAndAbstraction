package com.obsqura.training.abstraction;

public class MainClass {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
		Contractor contractor = new Contractor(8, 50);
		double fullTimeEmployeeSalary = fullTimeEmployee.calculateSalary();
        double contractorSalary = contractor.calculateSalary();
        System.out.println("Full Time Employee Salary:" +" "+"RS"+" "+ fullTimeEmployeeSalary);
        System.out.println("Contractor Salary:" +" " +"RS"+" "+contractorSalary);
        
	}

}
