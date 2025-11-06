package com.codegnan.constructor;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int rollNumber=sc.nextInt();
		int[] marks=new int[3];
		for(int i=0;i<marks.length;i++) marks[i]=sc.nextInt();
		Student s=new Student(name,rollNumber,marks);
		s.displayDetails();
		System.out.println("Total marks: "+s.calculateTotal()+"\nAverage marks: "+s.calculateAverage());
		sc.close();
	}
}
