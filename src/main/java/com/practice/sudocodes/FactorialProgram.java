//Factorial Program in Java: Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:


package com.practice.sudocodes;

import java.util.Scanner;

public class FactorialProgram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	System.out.println("enter a number to find facorial");
	Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial=factorial*i;
			
		}
		System.out.println(number+" factorial is : "+factorial);
	}

}
