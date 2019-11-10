package com.function;

import java.util.function.Function;

public class FunctionStringCase {
	private static boolean isOdd(int n) {
		return n % 2 == 1;

	}

	public static void main(String[] args) {

		System.out.println(FunctionStringCase.isOdd(3));
		FunctionStringCase.isOdd(3);

		Function<String, String> f = (text) -> text.toUpperCase();
		System.out.println(f.apply("Mahendra singh Dhoni"));
		Function<String, Integer> f1 = (t) -> t.length();
		System.out.println(f1.apply("mahendra Bahubali"));

		Function<Integer, Integer> square = n -> n * n;
		System.out.println("square of number is " + square.apply(25));

	}

}
