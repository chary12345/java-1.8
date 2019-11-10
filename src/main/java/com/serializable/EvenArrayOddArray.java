package com.serializable;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EvenArrayOddArray {
	public static void main(String[] args) {
		int[] a= {12,6,51};int[] b = {22,19,63,84,65};
		int alen = a.length;
		int blen  = b.length;
		int clen  = alen+blen;
		int[] c = new int[clen];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
			
		}
		for (int i = 0; i < b.length; i++) {
			c[alen+i]=b[i];
			
		}
		for (int i = 0; i < c.length; i++) {
			if(c[i]<=c[i]){
				
				System.out.println(c[i]);
			}
		}
		Arrays.sort(c);
		String string = Arrays.toString(c);
		System.out.println(Arrays.toString(c));
	
	//	System.out.println(string);
		
		int[] i = {1,6,4,2,3,551,62,96,45};
		EvenArrayOddArray eo = new EvenArrayOddArray();
		System.out.println("max array is"+eo.maxArray(i));
		int q = (int) EvenArrayOddArray.maxArray(i);
		int p = EvenArrayOddArray.minArray(i);
		int result = q-p;
		System.out.println(result);
	IntStream sorted = Arrays.stream(i).sorted();
	System.out.println(sorted.toArray());
		System.out.print(false);
	}

	private static int minArray(int[] min) {
		int minValue = min[0];
		for (int i = 1; i < min.length; i++) {
			if(min[i]<minValue){
				minValue = min[i];
			}
			
		}
		return minValue;
		
	}
	private static int maxArray(int[] max) {
		int maxValue = max[0];
		for (int i = 1; i < max.length; i++) {
			if(max[i]>maxValue){
				maxValue = max[i];
			}
			
		}
		return maxValue;
		
	}
	

}
