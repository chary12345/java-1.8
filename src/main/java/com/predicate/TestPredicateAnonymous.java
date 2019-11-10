package com.predicate;

import java.util.function.Predicate;

public class TestPredicateAnonymous {

	public static void main(String[] args) {
		
		 Predicate<Integer> p= new Predicate<Integer>() {

			

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			}
		};
		System.out.println(p.test(5659640));
		System.out.println(p.test(5659));
		System.out.println(p.test(5659));
		System.out.println(p.test(5650));
	}
}
