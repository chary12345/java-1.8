package com.practice.sudocodes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
	public static void main(String[] args) {
		
		//int []value = {(int) 1,5,6,5,7,6,8,9};
		ArrayList<String> list = new ArrayList<>();
		
		list.add("ravi");
		list.add("56");
		list.add("raju");
		list.add("rasi");
		list.add("rakul");
		list.add("rakesh");
		
		
		System.out.println("converying array list to array");
		//System.out.println(list);
		
		
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		
		System.out.println(array[0]);
		
		
		System.out.println("---------------------------");
		System.out.println("converting array to array list");

		
		for (String string : list) {
			System.out.println(string);
		}
	}
}
