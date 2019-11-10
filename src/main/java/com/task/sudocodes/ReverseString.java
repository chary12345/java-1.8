package task.sudocodes;
//reverse string in these program using for loop
import java.util.Scanner;

public class ReverseString {
	static String s;
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("enter a string reverse :");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String reverse = " ";
		
		for(int i= s.length()-1 ; i>=0;i--){
			reverse = reverse+s.charAt(i);
			
		}
		System.out.println("reverse of above string is : "+reverse);
	}

}

/*	System.out.print("enter a string :");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String rev= "";
		System.out.print("reverse of string is :");
		for(int i =string.length()-1; i>=0; i--){
			
			rev = rev+string.charAt(i);
		}
		System.out.println(rev);*/