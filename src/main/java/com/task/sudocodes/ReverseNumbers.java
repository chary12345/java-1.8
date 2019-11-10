package task.sudocodes;
//reverse number using whike loop

import java.util.Scanner;

public class ReverseNumbers {

	static double number;
	static double reverseNumber;
@SuppressWarnings("resource")
public static void main(String[] args) {
	//checkstt();
	
	System.out.print("enter number to reverse :");
	
	Scanner scanner = new Scanner(System.in);
	number = scanner.nextDouble();
		
	while(number != 0){//25
		reverseNumber = reverseNumber*10.00;//0//50//
		reverseNumber = reverseNumber+number%10.00;//5//50+0.25=52.5
		number = number/10;//2.5//2.5/10=0.25//
		
	}//int ignores decimals
	System.out.println("reverse number is : "+reverseNumber);
}
private static void checkstt() {
	final String s10 = "ravi";
	String s11 = s10.concat("ravi");
	
	System.out.println(s11);
 Integer i=10;
 Integer i1=10;
 System.out.println(i==i1);
 
 Integer i2=127;
 Integer i3=127;
 
 System.out.println(i2==i3);
	String s1 = new String("Java");
	s1.concat("developer");
	 String s6 =s1.concat("java");
	System.out.println("s1 is : "+s1);
	
	String s2 = new String("today");
	final String s3= new String("today");
	String s4 = s2+"exam";
	String s5 = s3+"exam";
	
	
	
	System.out.println(" double equals is "+s4==s5);
	System.out.println("s4.equals s5 is :"+s4.equals(s5));
	System.out.println("double equals "+s2==s3);
	System.out.println(s1.intern());
	System.out.println(s1==s1.intern());
	System.out.println(s1.intern());
	System.out.println(s2.intern()==s3.intern());
	
	System.out.println(  "intern method "+s6.intern());
	
	
	
}
}

		
