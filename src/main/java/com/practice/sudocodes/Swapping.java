//swapping 2 numbers

package com.practice.sudocodes;

import java.util.Scanner;

/**
 * 
 * @author ADMIN
 *swapping o inteegers
 *with out using third variable
 */
public class Swapping {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of x :");
		int x = sc.nextInt();
	
		System.out.println("enter value of y :");
		int y = sc.nextInt();
		System.out.println("--------------------------------------");
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("--------------------------------------");

		System.out.println("after swapping x= "+x);
		System.out.println("after swapping y = "+y);

	}
}
/*//swapping theory : assume two numbers x&y. add two nubers.do result substract second number,
//keep aside the value(1).these value substracted from addition of two numbers.
//see the out puts=swapped.value is 2,result is 1.*/