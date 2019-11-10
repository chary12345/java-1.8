//You can also use a method where number is not predefined. Here, user has to put the number to check if the number is prime.

package com.practice.sudocodes;

import java.util.Scanner;

public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
for (int i = 2; i < 100; i++) {
	if(i%2!=0 ){
		if(i%3!=0){
			if(i%4!=0){
				if(i%5!=0){
					if(i%6!=0){
						if(i%7!=0){
							if(i%8!=0){
								if(i%9!=0){
									if(i%i==0){
										System.out.println(i);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
}
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number :");
		 n = scanner.nextInt();
		if (isPrime(n)) {	
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

	private static void maths() {
	

//math.sqrt(double n);is a method it helps to find square root of the number.
	}

	private static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		/*for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false; math.sqrt(n) helps 
			}
}*/
		
		for(int i =2; i < Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}	
		return true;
	}
}
