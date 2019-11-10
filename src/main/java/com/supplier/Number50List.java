package com.supplier;

import java.util.LinkedList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Number50List {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		//ArrayList<Integer> list = new ArrayList<>();
	//	HashSet<Integer> list = new HashSet<>();
		// LinkedHashSet<Integer> list = new LinkedHashSet<>();
		//TreeSet<Integer> list = new TreeSet<>();
		
		list.add(22);
		list.add(25);
		list.add(36);
		list.add(41);
		list.add(42);
		list.add(46);
		list.add(49);
		list.add(56);
		list.add(57);
		list.add(58);
		list.add(69);
		list.add(76);
		
		
		
		Function<Integer, Integer> f = t -> {
			if (t < 50)
				return (t + 10);
			else
				
				return t;

		};
		
		
		System.out.println("the final output: ");
		//Consumer<Integer> c = t->System.out.println(t);
		/**
		 * even list of integers,add 10 to <50 integers,&print greternthan 50 numbers with non duplicates.
		 */
	 list.stream().filter(i->i%2==0).map(f).filter(t->t>50).collect(Collectors.toSet()).forEach(t->System.out.println(t));
	
	
	}
}
