package com.list;

import com.list.inter.IDivision;

public class DivisionImpl implements IDivision {

	@Override
	public void division(int a, int b) {
		
		System.out.println("The division Value is"+(a/b));
		
		
	}
	

}
