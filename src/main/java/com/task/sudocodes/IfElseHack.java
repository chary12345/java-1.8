package com.task.sudocodes;

import java.util.Scanner;
public class IfElseHack {

	 public static void main(String []args){



	        Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                Long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=-128 && x<=127)System.out.println("* byte");
	                if(x>=-32768 && x<=32767)System.out.println("* short");
	                	 
	                if(x>= -2147483648 && x<= 2147483647)System.out.println("* int");
	                if(x>=-9223372036 && x<=92233720368547758)
	                System.out.println("* long");
	                //Complete the code
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

	        }
	    }
	 }
	       /* Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();

	            int s = 0;
	            int z = (int)Math.pow(2,0);
	            s = (a + z*b);
	            System.out.printf("%d ",s);
	            for(int y=1;y<n;y++){          
	                int p = (int)Math.pow(2,y);
	                s = s +(p*b);
	                System.out.printf("%d ",s);
	                            
	            }System.out.printf("\n");

	        }
	        in.close();	 
	 }}
*/	 //  private static final Scanner scanner = new Scanner(System.in);

	 	   /* public static void main(String[] args) {
	    	
	        Scanner sc=new Scanner(System.in);
	        System.out.println("================================");
	        for(int i=0;i<3;i++)
	        {
	            String s1=sc.next();
	            int x=sc.nextInt();
	            System.out.printf("%-15s%03d%n", s1, x);
	        }
	        System.out.println("================================");

	}*/
    
/*	    	System.out.println("please enter a number.");
	        int N = scanner.nextInt();
	        
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        *//**
	         * Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
	         *//*
	        if(N%2==1 || (N>=6 && N <= 20)){
	  System.out.println("Weird");
	}else{
	 System.out.println("Not Weird");
	}
	        scanner.close();
	
	          
	        
	        }

	*/	



