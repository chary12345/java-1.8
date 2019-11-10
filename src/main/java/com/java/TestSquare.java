package com.java;

import com.list.SquareImpl;
import com.list.inter.ISquare;

public class TestSquare {

	public static void main(String[] args) {
		
		 ISquare sq = new SquareImpl();
		System.out.println("square of a given number is"+sq.squareNum(5));
	}
}
