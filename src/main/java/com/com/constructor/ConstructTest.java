package com.constructor;

public class ConstructTest {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	}


class Test{
	
	public static void main(String[] args) {
		
		ConstructTest ct = new ConstructTest();
		ct.setId(100);
		ct.setName("lux");
		
	}

}

