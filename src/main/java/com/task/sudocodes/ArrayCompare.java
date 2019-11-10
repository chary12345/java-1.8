package com.task.sudocodes;

import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		if(Arrays.equals(a, b)){
			System.out.println("two arrays are same");
		}
		else{
			System.out.println("two arrays are not same");
		}
		ArrayConcat.arraymerge();
	}
}
/**
 * array concatanation in java(binding two arrays)
 * @author ADMIN
 *
 */
class ArrayConcat{
	public static void arraymerge(){
		
		int[] x= {1,2,3,4};
		int[] y={5,6,7,8};
		
		int l1 = x.length;
		int l2 = y.length;
		
		int[] result = new int[l1+l2];
		System.arraycopy(x, 0, result, 0, l1);
		System.arraycopy(y, 0, result, l1, l2);
		System.out.println(Arrays.toString(result));
		
	}
}
