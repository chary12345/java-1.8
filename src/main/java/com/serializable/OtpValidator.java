package com.serializable;

import java.util.Random;

public class OtpValidator {

	 public static void main(String[] args) {

	      //System.out.println(generateOTP(6));
		// String number = "abcdefghijklmnopqrstuvwxyz1234567890";
		 String number  = "1234567890";
		 Random random = new Random();
		int length = 4;
		char [] otp =  new char[length];
		for(int i =0; i<length ; i++){
			otp[i] = number.charAt(random.nextInt(number.length()));
		}
		System.out.println(otp);
	   }

	  /* private static char[] generateOTP(int length) {
	      String numbers = "1234567890";
	      Random random = new Random();
	      char[] otp = new char[length];

	      for(int i = 0; i< length ; i++) {
	         otp[i] = numbers.charAt(random.nextInt(numbers.length()));
	      }
	      return otp;
	   }*/
}
