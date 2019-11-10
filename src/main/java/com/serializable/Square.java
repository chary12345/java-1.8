package com.serializable;

import java.util.Scanner;

public class Square {

	static double d;
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number find");
	int l = sc.nextInt();
	double res = Math.pow(l, 2);
	System.out.println(res);
	
	
}
}