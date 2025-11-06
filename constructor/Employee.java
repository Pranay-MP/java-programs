package com.codegnan.constructor;

public class Employee {
	int id;
	String name;
	String department;
	public Employee() {
		this(0,"unknown", "unknown");
	}
	
	public Employee(int i, String string,String dept) {
		System.out.printf("ID: %d\nName: %s\nDeparment: %s",i,string,dept);
	}

	public static void main(String[] args) {
		Employee e=new Employee(101,"Pranay", "Associate");
	}
}

