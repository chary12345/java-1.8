package com.task.sudocodes;

import java.util.Scanner;

public class TablesMaths {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      /*  Integer N = scanner.nextInt();
     //   scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String x1 = scanner.next();
        for(Integer c= 1; c<=10; c++){
        	Integer x=N*c;
        	String s = x.toString();
        	if(s.contains(x1)){
        		System.out.println();
        	}else {
        		System.out.println(N+" x "+c+" = "+x);}
			
        }*/
    	
//like();
reverse();
        scanner.close();
    }

	private static void reverse() {
		// TODO Auto-generated method stub
		
		
	}

	private static void like() {
		// TODO Auto-generated method stub
		 String x1 = scanner.next();
		 Integer x = scanner.nextInt();
		for(x=x;x>=0;--x){
			String s1 = x.toString();
			for(int i=s1.length();i>=0;i--){
				int s2=s1.charAt(i);
			}
			if(s2.contains(x1))
			System.out.print("");
			else
				System.out.println(x);
		}
		
	}
}
