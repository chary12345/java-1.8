package com.predicate;

import java.util.function.Predicate;

public class PredicateLambda {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i->i%2==0;
		
		System.out.println(p.test(2561
				+6469597));
		System.out.println(p.test(256119665));
		System.out.println(p.test(25666));
		
	}
}
