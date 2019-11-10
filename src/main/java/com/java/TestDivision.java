package com.java;

import com.list.DivisionImpl;
import com.list.inter.IDivision;

public class TestDivision {

	public static void main(String[] args) {
		
		IDivision div = new DivisionImpl();
		div.division(22, 11);
	}
}
