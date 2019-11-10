package practice;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Practice1 {
	public static void main(String[] args) {
		Integer[] a = { 1, 5, 6, 9, 8, 6, 37, 6, 5, 8 };

		Predicate<Integer> p = t -> t % 2 == 0;
		Stream<Integer> s = Arrays.stream(a);

		s.filter(p).map(t -> t + 1).forEach(x -> System.out.println(x));

	}

}
