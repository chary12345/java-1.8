package com.supplier;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CORBA.portable.ValueBase;

public class NonDuplicates extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
for (int i = 0; i < 5; i++) {
	value[i]  = ValueBase[i]*2;
		}
	}

	public static void main(String[] args) {
		int[] value = {1,2,3,4,5};
		Thread t = new Thread();
		t.start();
		
		
/*		ArrayList<Integer> list = new ArrayList<>();
		list.add(102);
		list.add(12);
		list.add(27);
		list.add(232);
		list.add(292);
		list.add(29);
		list.add(232);
		Function<Integer, Integer> f = t->{
			if(t<50){
				
				return (t+10);
			}else{
				return t;
			}
		};
		list.stream().filter(t->t%2==0).map(f).filter(t->t>50).collect(Collectors.toSet()).forEach(t->System.out.println(t));
*/	
		
	}
}
