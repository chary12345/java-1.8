package com.practice.sudocodes;

import java.util.Scanner;
/**
 * upi verifaicatin password
 * @author ADMIN
 *
 */
public class CheckPass {
@SuppressWarnings("resource")
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("enter your password  here: ");
	String s1 = sc.nextLine();
	int display = PasswordValidator.dis(s1);
	if(display==1){
		System.out.println("valid password");
	}else{
		System.out.println("invalid password");
	}
	
	
}
}
