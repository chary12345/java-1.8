package com.java;

import java.util.function.Function;
import java.util.function.Supplier;

public class TestHello {

	 static String name  ;
	public static void main(String[] args) {
	
		Function<String, Integer> p = n->
		
		n.length();
		System.out.println(p.apply("vikram veda"));
		Supplier<String> sup = ()->"Hello java"+name;
		System.out.println(sup.get());
		
	}
}
