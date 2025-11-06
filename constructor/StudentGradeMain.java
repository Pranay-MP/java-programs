package com.codegnan.constructor;

import java.util.Scanner;

public class StudentGradeMain {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        
		        String name = sc.nextLine();
		        int rollNumber = sc.nextInt();
		        int gradeLevel = sc.nextInt();

		        try {
		            StudentGrade s = new StudentGrade(name, rollNumber, gradeLevel);
		            s.showProfile();
		        } catch (Exception e) {
		            System.out.println("Error: " + e.getMessage());
		        }

		        sc.close();
		    }
		
	
}
