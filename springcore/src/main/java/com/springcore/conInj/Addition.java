package com.springcore.conInj;

import java.text.ParseException;

public class Addition {

	private int a;
	private int b;

	public Addition(int a, int b) {

		this.a = a;
		this.b = b;
		System.out.println("cons: int,int");
	}

	public Addition(double a, double b) {

		this.a = (int)a;
		this.b =(int) b;
		System.out.println("cons: double,double");
	}
	public Addition(String a, String b) {

		this.a = Integer.parseInt(a);
		this.b =Integer.parseInt(b);
		System.out.println("cons: string,string");
	}
	
	public void doSum() {
		System.out.println("value of a "+this.a+" And b is "+this.b);
		System.out.println("Sum is equal to "+(this.a+this.b));
	}
}
