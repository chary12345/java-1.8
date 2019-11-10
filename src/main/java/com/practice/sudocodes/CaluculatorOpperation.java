package com.practice.sudocodes;

import java.awt.Desktop.Action;
import java.util.Scanner;

public class CaluculatorOpperation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a;
		int b;
		int result;

		Scanner scanner = new Scanner(System.in);//helps to enter values on console
		System.out.print("enter a value :");
		a = scanner.nextInt();
		
		System.out.print("enter b value :");
		b = scanner.nextInt();

		System.out.print("enter performing action : (+,-,*,/)");

		char action = scanner.next().charAt(0);

		// switch case starts to perform caluculation actions

		switch (action) {
		case '+':
			result = a + b;
			break;

		case '-':
			result = a - b;
			break;

		case '*':
			result = a * b;
			break;

		case '/':
			result = a / b;
			break;

		default:
			System.out.println(" sorry,you are choosing a incorrect action");

			return;
		}

		System.out.println(a + " " + action + " " + b + "=" + result);
	}

}
