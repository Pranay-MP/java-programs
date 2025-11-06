package com.codegnan.constructor;

public class SchoolAdmission {
	String name;
	int rollNumber;
	int grade;
	public  SchoolAdmission( String name,int rollNumber,int grade){
		try {
		if(name.equals(null)||name.trim().isEmpty()) {
			System.out.println("name cannot be empty");
		}if(rollNumber==0) {
			System.out.println("rollnumber must be positive");
		}if(grade<0 || grade>12) {
			System.out.println("grade level must be between 1 to 12");
		}
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void showDetails() {
		System.out.println("Name: "+name+", Roll Number:"+rollNumber+", Grade: "+grade);
	}
}
