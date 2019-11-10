package com.consumers;

import java.util.function.Consumer;

public class TestConsumers {

	public static void main(String[] args) {
		Consumer<Integer> c = t->System.out.println("multiplicaion : "+(t*25));
		Consumer<Integer> c1 = t->System.out.println("division is :"+(t/25));
		Consumer<Integer> c2 = t->System.out.println("adition:"+(t+25));
		Consumer<Integer> c3 = t->System.out.println("substraction is :"+(t-25));
		Consumer<Integer> c4 = t->System.out.println("sqaure is :"+(t*t));
		
		c.andThen(c1).andThen(c2).andThen(c3).andThen(c4).accept(30);

		
	}
	
	
}
