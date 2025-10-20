package com.codegnan.controlstatements;

import java.util.Scanner;

public class Quadrilateral {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Dimensions of Sides: ");
		String sides=sc.nextLine();
		String[] side=sides.split(" ");
		int a = Integer.parseInt(side[0]);
		int b = Integer.parseInt(side[1]);
		int c = Integer.parseInt(side[2]);
		int d = Integer.parseInt(side[3]);
		if(a==c&&b==d&& a!=d)System.out.println("Rectangle");
		else if(a==b&&b==c&&a==d)System.out.println("Square");
		else System.out.println("other");
		sc.close();
		
	}

}
