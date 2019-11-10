package com.java;

import com.list.inter.ISquare;

public class TestSquareLambda {

	public static void main(String[] args) {
		ISquare is = n-> n*n;
			
			System.out.println("square of number is : "+is.squareNum(25));
		
	}
}
