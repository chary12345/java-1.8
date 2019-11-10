package com.predicate;

public class Predicatest {

	public static void main(String[] args) {
		 
		PredicateImpl p = new PredicateImpl();//predicate always returns the boolean value
		System.out.println(p.test(12365));
		System.out.println(p.test(125));
		System.out.println(p.test(365));
		System.out.println(p.test(12));
		
	}
}
