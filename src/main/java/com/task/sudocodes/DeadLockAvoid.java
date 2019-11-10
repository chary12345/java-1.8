package com.task.sudocodes;

public class DeadLockAvoid extends Thread{
	@Override
		public void run() {
	m2();
	
	m1();
		}
public static void main(String[] args) {
	Thread t = new Thread();
	t.start();
}
	public void m1() {
		synchronized (Integer.class) {
			
			System.out.println("aquired string class");
			synchronized (String.class) {
				System.out.println("aquired integer class");
				
			}
		}
		
	}
	public void m2() {
		synchronized (Integer.class) {
			System.out.println("aquired integer class");
			
			synchronized (String.class) {
				
				System.out.println("aquired string class");
			}
		}
	}
}
