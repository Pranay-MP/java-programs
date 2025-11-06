package com.codegnan.constructor;

import java.util.Arrays;

public class Student {
	String name;

	int rollNumber;

	int marks[] ;

	private int total;
	Student(){
		name="unknown";
		rollNumber=0;
		marks = new int[] {0, 0, 0};
	}
	public Student(String name,int rollNumber,int[] marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	public void displayDetails() {
		System.out.println("--------Student Deatails--------");
		System.out.println("Name:"+name+"\nStudent RollNumber"+rollNumber+"\nMarks"+Arrays.toString(marks));
	}public int calculateTotal() {
		total=0;
		for (int i=0;i<marks.length;i++) {
			total+=marks[i];
		}return total;
		
	}public double calculateAverage() {
		return total/marks.length;
	}
}
