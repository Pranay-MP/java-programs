package com.codegnan.fundamentals;

import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter radius: ");
		int radius=sc.nextInt();
		double area=3.14*radius*radius;
		System.out.println("Area Of Circle is "+area);
		sc.close();
		
	}
}
