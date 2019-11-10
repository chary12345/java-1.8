package com.java;

import com.list.inter.IDivision;

public class TestDivLambda {
public static void main(String[] args) {
	
	IDivision id = (int a, int b)->{
		System.out.println("division of input value is :"+(a/b));
	};
	id.division(50, 2);
}
}
