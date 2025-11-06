package com.codegnan.constructor;

public class StudentGrade {

	    // Instance Variables
	    private String name;
	    private int rollNumber;
	    private int gradeLevel;

	    // Constructor with validation
	    public StudentGrade(String name, int rollNumber, int gradeLevel) throws Exception {
	        if (name == null || name.trim().isEmpty()) {
	            throw new Exception("Name cannot be empty");
	        }
	        if (rollNumber <= 0) {
	            throw new Exception("Roll number must be positive");
	        }
	        if (gradeLevel < 1 || gradeLevel > 12) {
	            throw new Exception("Grade level must be between 1 and 12");
	        }

	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.gradeLevel = gradeLevel;
	    }

	    // Method to display student details
	    public void showProfile() {
	        System.out.println("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + gradeLevel);
	    }
	
}
