package com.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.function.StudentPojo;


/**
 * 
 * @author FreeChaitanya Parayana
 *Topper list above 850marks
 */
public class TestSupplier {

	public static void main(String[] args) {

		Supplier<List<StudentPojo>> stdlist = () -> {
			List<StudentPojo> list = new ArrayList<>();
			list.add(new StudentPojo("ameer", 100, "FreeChaitanya Parayana", 960));
			list.add(new StudentPojo("gareeb", 101, "FreeChaitanya Parayana", 460));
			list.add(new StudentPojo("jareeb", 104, "FreeChaitanya Parayana", 860));
			list.add(new StudentPojo("kareeb", 102, "FreeChaitanya Parayana", 779));
			list.add(new StudentPojo("aayub", 106, "FreeChaitanya Parayana", 963));
			list.add(new StudentPojo("masthan", 105, "FreeChaitanya Parayana", 454));
			list.add(new StudentPojo("mujafar", 103, "FreeChaitanya Parayana", 755));
			return  list;
		};

		
		Consumer<StudentPojo> s = std -> {
			System.out.println(std.getName());
			System.out.println(std.getId());
			
			System.out.println(std.getMarks());
			
		};
		
		
		Predicate<StudentPojo> p = std->std.getMarks()>850;
		
		Function<StudentPojo, StudentPojo> f = std->{
			if(std.getMarks()<(850))
				std.setMarks(std.getMarks()+100);
		
			return std;
		};
		
		System.out.println("toppers of 2018-19");
		
	
		for (StudentPojo stdtopers : stdlist.get()) {
			
			f.apply(stdtopers);
			if(p.test(stdtopers))
			s.accept(stdtopers);
			
			System.out.println("-----------------");
			
			
		}
		
			
		
		}
	}
	

