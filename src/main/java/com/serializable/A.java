package com.serializable;

public class A {
	
		private  static String  x ;	
		
		//static String d;
		 public static void main(String[ ] args) {
			// String x ;
			 String c;
			 A d=new A();
			 A b = new A();
			 
			 c="hiii";
			d.x ="hiii";
		   A a = new A();
		   a.x ="java1" ;
		   System.out.println(a.x.hashCode());
		   b.x = "java1";
		   System.out.println(b.x.hashCode());
		   
		   System.out.println(a.equals(b))
		   
		   
		   ;		
		   System.out.println(c==d.x);
		   System.out.println(c.equals(d));
		 }
		
}
