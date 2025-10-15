package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name= sc.next();
		System.out.print("Enter Roll Number: ");
		int roll_number=sc.nextInt();
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		System.out.print("Enter Grade: ");
		String grade=sc.next();
		System.out.println();
		System.out.println("Student Name: "+name);
		System.out.println("Student Roll Number: "+roll_number);
		System.out.println("Student age: "+age);
		System.out.println("Student Grade: "+grade);
		sc.close();
	}

} 
