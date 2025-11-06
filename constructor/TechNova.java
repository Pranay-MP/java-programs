package com.codegnan.constructor;

import java.util.Scanner;

public class TechNova {
	int empId;
	String name;
	double salary;
	int experience;
	public TechNova() {
		this (0,"unknown",0,0);
	}
	public TechNova(int empId, String name, double salary, int experience) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
	public void showDetails() {
        System.out.println("\nEmployee Details");
        System.out.println("--------------------------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Salary (₹)    : " + salary);
        System.out.println("Experience    : " + experience + " years");
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		int salary=sc.nextInt();
		int exp=sc.nextInt();
		TechNova t=new TechNova();
		t.showDetails();
		TechNova tn=new TechNova(id,name,salary,exp);
		tn.showDetails();
		sc.close();
	}

}
