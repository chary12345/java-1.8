package com.consumers;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.function.StudentPojo;

public class StudentConsumer {

	
	public static void main(String[] args) {
		ArrayList<StudentPojo> list = new ArrayList<>();
		
		list.add(new StudentPojo("ameer", 100, "vittalacharya", 960));
		list.add(new StudentPojo("gareeb", 101, "vittalacharya", 460));
		list.add(new StudentPojo("jareeb", 104, "vittalacharya", 860));
		list.add(new StudentPojo("kareeb", 102, "vittalacharya", 679));
		list.add(new StudentPojo("aayub", 106, "vittalacharya", 963));
		list.add(new StudentPojo("masthan", 105, "vittalacharya", 954));
		list.add(new StudentPojo("mujafar", 103, "vittalacharya", 500));
		
		Consumer<StudentPojo> s = std->{System.out.println(std.getName());
		System.out.println(std.getId());
		System.out.println(std.getMarks());
		};
		
	for (StudentPojo test : list) {
		s.accept(test);
	}
	}
}
