package com.practice.sudocodes;

import java.util.Scanner;
//ignore  number
public class IntIgnore {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	for (Integer i = 0; i <=100; i++) {
		String string = i.toString();
		if(string.contains("5")){
			System.out.println("");
		}
		else{
			System.out.println(string);
		}
	}	
		
			
		}
			

}
