package com.codegnan.operatorexample;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter marks: ");
		int marks=sc.nextInt();
		System.out.println("Student Grade: "+(marks>=90? "A":
							marks>=80?"B":
								marks>=70?"C":
									marks>=60?"D":
										marks>=50?"E":
													"F"));
		sc.close();
	}
}
