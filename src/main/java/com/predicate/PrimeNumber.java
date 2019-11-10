package com.predicate;

import java.util.Scanner;

//prime number or not
public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of x :");
		 x = sc.nextInt();
		if(x>=1){
			for(int i=2; i<Math.sqrt(x);i++){
				if(x%i==0){
					System.out.println("not a prime number");
					break;
				}else{
					System.out.println("prime number");
					break;
				}
					
			}
		}
	}

}
