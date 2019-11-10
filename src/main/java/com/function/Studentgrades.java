package com.function;

import java.util.ArrayList;
import java.util.function.Function;

public class Studentgrades {

	
	public static void main(String[] args) {
		
		
		ArrayList<StudentPojo> list = new ArrayList<>();
		list.add(new StudentPojo("ameer", 100, "vittalacharya", 960));
		list.add(new StudentPojo("gareeb", 101, "vittalacharya", 460));
		list.add(new StudentPojo("jareeb", 104, "vittalacharya", 860));
		list.add(new StudentPojo("kareeb", 102, "vittalacharya", 679));
		list.add(new StudentPojo("aayub", 106, "vittalacharya", 963));
		list.add(new StudentPojo("masthan", 105, "vittalacharya", 954));
		list.add(new StudentPojo("mujafar", 103, "vittalacharya", 500));
		
		Function<StudentPojo, Character> grade = s->{
			if(s.getMarks()>850)
				return 'A';
			else if(s.getMarks()>750)
				return 'B';
			else if(s.getMarks()>=500)
				return 'c';
			else 
				return 'F';
		};
		
		for (StudentPojo gradelist : list) {
			System.out.println(gradelist+" grade-"+grade.apply(gradelist));
			
		}
	}
		
	}


