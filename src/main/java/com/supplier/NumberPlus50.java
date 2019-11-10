package com.supplier;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class NumberPlus50 {

	public static void main(String[] args) {
	//	std();
		int[] values = new int[] { 22, 36, 42, 46, 49, 51, 67, 68, 71, 76, 84, 89, 92, 96 };
		
	//	IntStream stream1 = Arrays.stream(values);
		
	//	IntPredicate intP = t -> t % 2 == 0;
		
		IntUnaryOperator f = t -> {
			if (t < 50)
				return (t + 10);
			else
				return t;

		};
		
	
	IntPredicate intP1 = t -> t > 50;
		
	
	
		

		/*System.out.println("the final out put as");
		for (int i : values) {
			if (intP.test(i)) {
				int j = f.apply(i);
				if (intP1.test(j))
				System.out.println(j);
			}
		}*/
		Arrays.stream(values).filter(t->t%2==0).map(f).filter(intP1).map(t->t+10).filter(t->t<100).forEach(x -> System.out.println(x));

	}

	
}
