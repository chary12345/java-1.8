//To print sum of two digits of x+y;

package practice.sudocodes;

import java.util.Scanner;

public class SumOfTwoNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter a value of x=");
		
		int x = sc.nextInt();
		System.out.print("please enter a value of y=");
		int y = sc.nextInt();
	int z =	x+y;
		System.out.println("sum of x+y = "+ x+y);
	}
}
