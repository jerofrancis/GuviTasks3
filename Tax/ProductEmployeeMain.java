package com.demo.task3.Tax;

import java.util.Scanner;

public class ProductEmployeeMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter EmployeeId");
		Scanner eid = new Scanner(System.in);
		int empid = eid.nextInt();
		System.out.println("Enter name");
		Scanner name = new Scanner(System.in);
		String name1 = name.next();
		System.out.println("Enter Employee Salary");
		Scanner es = new Scanner(System.in);
		int salary = es.nextInt();
		Taxable emp = new Employee(empid,name1,salary);
		emp.calcTax();
		
		System.out.println("Enter ProductID");
		Scanner pid = new Scanner(System.in);
		int productId = pid.nextInt();
		
		System.out.println("Enter Product Price");
		Scanner pp = new Scanner(System.in);
		int price = pp.nextInt();
		
		System.out.println("Enter Quantity");
		Scanner qty = new Scanner(System.in);
		int quantity = qty.nextInt();
		
		Taxable prd = new Product(productId,price,quantity);
		prd.calcTax();
	}
}
