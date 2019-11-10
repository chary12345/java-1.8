package com.function;

public class StudentPojo {

	
	@Override
	public String toString() {
		return name +" "+ "marks=" + marks ;
	}
	private String name;
	private int id;
	private String college;
	private int marks;
	public StudentPojo(String name, int id, String college, int marks) {
		
		this.name = name;
		this.id = id;
		this.college = college;
		this.marks = marks;
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	}
