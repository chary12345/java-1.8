package com.predicate;

import java.awt.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PresicateForEmployeSalary {

	
	public static void main(String[] args) {
		
		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee("raju", 100, 102000));
		emplist.add(new Employee("mahendar", 103, 1180000));
		emplist.add(new Employee("vijayender", 104, 1350000));
		emplist.add(new Employee("devendar", 105, 990000));
		emplist.add(new Employee("manikanta", 106, 1140000));
		
		emplist.add(new Employee("dattatreya", 107, 1040000));
		
		/**
		 * get the employee who having more than 104k
		 * in1.8 java
		 */
		Predicate<Employee> p = emp-> emp.getSalary()>10;
		
		for (Employee emp : emplist) {
			
			if(p.test(emp)){
				System.out.println(emp);
			}
			
		}
		/**
		 * performing predicate opperation to print only even number id employee
		 */
		
		Predicate<Employee> p1 = emp->emp.getId()%2==0;
		System.out.println("even number employee list");
		for (Employee empeven : emplist) {
			if(p1.test(empeven))
				System.out.println(empeven);
			
		}
	}
	
}
