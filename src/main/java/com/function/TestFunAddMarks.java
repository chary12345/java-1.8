package com.function;

import java.util.ArrayList;
import java.util.function.Function;

public class TestFunAddMarks {

	public static void main(String[] args) {
		ArrayList<StudentPojo> list = new ArrayList<>();
		
		list.add(new StudentPojo("ameer", 100, "vittalacharya", 960));
		list.add(new StudentPojo("gareeb", 101, "vittalacharya", 460));
		list.add(new StudentPojo("jareeb", 104, "vittalacharya", 860));
		list.add(new StudentPojo("kareeb", 102, "vittalacharya", 679));
		list.add(new StudentPojo("aayub", 106, "vittalacharya", 963));
		list.add(new StudentPojo("masthan", 105, "vittalacharya", 954));
		list.add(new StudentPojo("mujafar", 103, "vittalacharya", 500));
		
		Function<StudentPojo, StudentPojo> mark = s->{s.setMarks(s.getMarks()+5);
		return s;
			};
			System.out.println("the new resust for intermediate for vittalacharya college students :");
			for (StudentPojo std : list) {
				System.out.println(mark.apply(std));
				
			}
	
	}
}
