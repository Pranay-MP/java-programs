package com.codegnan.fundamentals;

import java.util.Scanner;


public class AreaTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base of triangle: ");
		int base=sc.nextInt();
		System.out.print("Enter height of tringle:");
		int height=sc.nextInt();
		double area= 0.5*base*height;
		System.out.println("Area of Triangle: "+area);
		sc.close();
	}

}
