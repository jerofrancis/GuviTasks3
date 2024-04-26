package com.demo.task3.Tax;

public class Product implements Taxable {
	
	int pid;
	int price;
	int quantity;
	
	
	
	public Product(int pid, int price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}



	@Override
	public void calcTax() {
		// TODO Auto-generated method stub
		int salesTax = (salesTaxP*price)/100;
		System.out.println("sales tax: "+salesTax);
	}

}
