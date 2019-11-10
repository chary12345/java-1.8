package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;

public class Serialize {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		/*Student s1 = new Student("Raju", 100, "Siei", "eeraptnam");
	
		FileOutputStream fio = new FileOutputStream("F:\\New folder (3)\\Peru.txt");
		System.out.println("file created");
		ObjectOutputStream obj = new ObjectOutputStream(fio);
		obj.writeObject(s1);
		System.out.println("end");
obj.close();	*/	
		
		FileInputStream fis = new FileInputStream("F:\\New folder (3)\\Peru.txt");
		System.out.println("file loaded");
		ObjectInputStream oi= new ObjectInputStream(fis);
		
		Student s2 = (Student) oi.readObject();
		System.out.println(s2);
		System.out.println("file read succesefull");
				
	}}