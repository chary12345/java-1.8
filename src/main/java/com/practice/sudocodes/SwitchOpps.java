package practice.sudocodes;

import java.util.Scanner;

//Caluculator opperations using switch case;
public class SwitchOpps {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a,b,c ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a int value: ");
		a= sc.nextInt();
		System.out.println("enter b int value: ");
		b= sc.nextInt();
		
		System.out.println("select a opperator perform caluculator action(+,-,*,/)");
		char test = sc.next().charAt(0);
		
		switch (test) {
		case '+':
			System.out.println(c=a+b);
			break;
		case '-':
			System.out.println(c=a-b);
			break;
		case '*':
			System.out.println(c=a*b);
			break;
		case '/':
			System.out.println(c=a/b);
			break;
		default:
			System.out.println("enter oppeator is not valid");
			return;
		}
		//System.out.println(a+" "+test+""+b+" ="+c);
	}

}
