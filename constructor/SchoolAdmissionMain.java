package com.codegnan.constructor;

import java.util.Scanner;

public class SchoolAdmissionMain {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int rollNumber=sc.nextInt();
		int grade=sc.nextInt();
		if (name.equals(null)||name.trim().isEmpty())System.out.println("");
		SchoolAdmission sa=new SchoolAdmission(name ,  rollNumber, grade);
		sa.showDetails();
		sc.close();
	}
}
