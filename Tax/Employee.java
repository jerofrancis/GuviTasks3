package com.demo.task3.Tax;

public class Employee implements Taxable{

	int empId;
	String name;
	int salary;
	
		
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void calcTax() {
		// TODO Auto-generated method stub
		int incomTax=(int) (incomTaxP*salary)/100;
		System.out.println("income tax: "+incomTax);
	}
}
