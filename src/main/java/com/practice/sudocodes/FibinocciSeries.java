/*//write a program to print fibinocci series
In fibonacci series, next number is the sum of previous two numbers .
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.*/

package com.practice.sudocodes;

public class FibinocciSeries {

	public static void main(String[] args) {
		
	/*	int x=0;
		int y = 1;
		
		System.out.println("fibinoccseries of first 100 numbers are given below");
		
		System.out.print(x+" "+y);
		int z;
		for(int i=2;i<=10;++i){
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
			
		}*/
		int x = 0;
		int y = 1;
		int z;
		
		for (int i=1;i<10;++i){
			z=x+y;
			System.out.println(" "+z);
			x=y;
			y=z;
		}
	}
	
}
