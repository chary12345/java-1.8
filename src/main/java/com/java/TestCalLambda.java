package com.java;

import com.list.inter.IParent;

public class TestCalLambda {

	public static void main(String[] args) {
		IParent cal =( a,  b)->{
		
		System.out.println(a+b);
		};
		cal.m1(10, 20);
	}
}
