package com.predicate;

import java.util.function.Predicate;

public class PredicateMethods {

	public static void main(String[] args) {
		int[] values = {20, 93, 15, 5, 77, 64, 22, 30, 50, 97};
		Predicate<Integer> p  = i->i%2!=0;
		Predicate<Integer> p1 = i->i>20;
		
		for (int j : values) {
			System.out.println(j+" "+p.and(p1).test(j));
			
		}
		
	}
}
