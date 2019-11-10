package com.com.constructor;

public class ConstructChain {

	ConstructChain(int x) {
		//this(10);// this line reflects compile time exception that to recursive
		// invacation exception
		this(10,5);
		System.out.println(x + 5);
	}

	public ConstructChain(int i, int j) {
		super();
		System.out.println(i * j);
	}

	public static void main(String[] args) {
		new ConstructChain(25);

	}
}
