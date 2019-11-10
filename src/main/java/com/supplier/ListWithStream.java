package com.supplier;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ListWithStream {

	public static void main(String[] args) {
		
int[] allay = {2,65,96,84,36,45,20,78,61};
String s5 = Arrays.toString(allay);System.out.println(s5);

IntStream sorted = Arrays.stream(allay).sorted();System.out.println(sorted.toString());



	/*List<StudentPojo> list = new ArrayList<>();
	list.add(new StudentPojo("ameer", 100, "vittalacharya", 960));
	list.add(new StudentPojo("gareeb", 101, "vittalacharya", 460));
	list.add(new StudentPojo("jareeb", 104, "vittalacharya", 860));
	list.add(new StudentPojo("kareeb", 102, "vittalacharya", 679));
	list.add(new StudentPojo("aayub", 106, "vittalacharya", 963));
	list.add(new StudentPojo("masthan", 105, "vittalacharya", 954));
	list.add(new StudentPojo("mujafar", 103, "vittalacharya", 500));
	Object[] array = list.toArray();
for (Object object : array) {
	System.out.println(object);
}
	
	list.stream().filter(s->s.getId()%2==0).collect(Collectors.toList()).forEach(t->System.out.println(t));
	for (StudentPojo i : even) {
		
		System.out.println(i);
	}
	Function<StudentPojo, StudentPojo> f = std->{
		if(std.getMarks()<(500))
			std.setMarks(std.getMarks()+100);
	
		return std;
	};
	List<StudentPojo> failure = list.stream().map(f).collect(Collectors.toList());
	List<StudentPojo> topper = list.stream().filter(t->t.getMarks()>=500).collect(Collectors.toList());
	for (StudentPojo looser : failure) {
		
		System.out.println(looser);
	}
	System.out.println("toppers list");
	for (StudentPojo toppers : topper) {
		System.out.println(toppers);
	}
}*/
}

	
}