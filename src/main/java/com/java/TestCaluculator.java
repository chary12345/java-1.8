package com.java;

import com.list.CaluculatorImpl;
import com.list.inter.IParent;

public class TestCaluculator {
	
	public static void main(String[] args) {
//		FunctionalInterface cal = ( a ,b)-> {res=a+b};

		IParent cal = new CaluculatorImpl();
		cal.m1(10, 20);
	}

}

