package com.serializable;

import java.io.Serializable;

public class Student implements Serializable{
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", college=" + college + ", location=" + location + "]";
	}
	public Student(String name, int id, String college, String location) {
		super();
		this.name = name;
		this.id = id;
		this.college = college;
		this.location = location;
	}
	private String name;
	private int id;
	private String college;
	private String location;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
