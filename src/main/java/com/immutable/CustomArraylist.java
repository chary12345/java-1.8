package com.immutable;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomArraylist implements Comparator<CustomArraylist> {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(1265);
		l.add(162);
		l.add(120);
		System.out.println();
	//Collections.sort(l, );
		
		System.out.println(l);
	}

	@Override
	public int compare(CustomArraylist a, CustomArraylist b) {
		// TODO Auto-generated method stub
		if (a == b) {
			return 0;
		}
		if (a != b) {
			System.out.println();
			return -1;
		} else {
			return 1;
		}
	}

}
