package com.multithread;

 class A{
	int x;
	public A(int y){
	x=x+y;
	
	}
public String toString(){
	return "x";
	
}
}
public class B{
	public static void main(String[] args) {
		System.out.println(new A(10));
	}
	
}
