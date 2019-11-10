package com.task.sudocodes;

import java.util.Scanner;

public class PyramidStar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter a number how many stars of pyramid you want : ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = (n - i); j > 1; j--) {
				System.out.print(" ");

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

	private static void chello() {
		// TODO Auto-generated method stub

		for (int i = 2; i < 10; i = i * i) {
			System.out.println(i);
		}

	}

}