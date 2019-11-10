//find given no is armstrong or not

/*Armstrong Number in Java: A positive number is called armstrong number if it is equal 
to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.*/

package com.practice.sudocodes;

import java.util.Scanner;

/**
 * A positive number is called armstrong number if it is equal to the sum of
 * cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
 */
public class ArmstrongNUmber {

	public static void main(String[] args) {
		int x ,y;
		int temp,result=0;;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  number : ");
		x = sc.nextInt();
		
		for(y=x;y!=0;y=y/10){
			temp=y%10;
			result = result+temp*temp*temp;
	}
		
		if(result==x){
			System.out.println("yes armstrong number");
		}else{
			System.out.println("not armstrong");
		}
	}

}
