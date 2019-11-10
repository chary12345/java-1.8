package task.sudocodes;

import java.util.Scanner;
import java.util.function.Predicate;

public class EvenAndOddNumbers {

	static int x;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("please enter value of x(integers) :");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(x%2==0){
			System.out.println
			(x+" is a even number");
		}
		else{
			System.out.println(x+" is a odd number");
		}
		
		
	}
}
