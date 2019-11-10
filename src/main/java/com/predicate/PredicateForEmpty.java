package com.predicate;

import java.util.function.Predicate;

public class PredicateForEmpty {

	public static void main(String[] args) {
		
		String name ="rakesh";
		String id = "";
		String sal = null;
		
		
		Predicate<String> p = t->t.isEmpty() || t==null;
		
		System.out.println(p.test(name));
		System.out.println(p.test(id));
		//System.out.println(p.test(sal));
		System.out.println("mahesh");
	}
}
