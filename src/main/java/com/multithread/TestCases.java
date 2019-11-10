package com.multithread;

public class TestCases  {

	
	public static void main(String[] args) throws InterruptedException { 
		Mytest t = new Mytest();
	  t.start();
	  Thread.sleep(1000*15);
	  m1();
	  }
static void m1(){
		
for(int i=0; i<100; i++){
		
		System.out.println(i+" m2- by : "+Thread.currentThread().getName());
	}
	}
 void m2(){
	for(int i=0; i<100; i++){
		
		System.out.println(i+" m2- by : "+Thread.currentThread().getName());
	}
}
}

class Mytest extends Thread {
	
	@Override public void run() { // TODO Auto-generated method stub
	// System.out.println(Thread.currentThread().getName()); 
		
	TestCases tc = new TestCases();
	tc.m2(); 
	}


	

}
