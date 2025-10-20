package com.codegnan.controlstatements;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input: ");
		double input=sc.nextDouble();
		double square=Math.sqrt(input);
		if (input==square* square) System.out.println("Perfect Square");
		else System.out.println("Not Perfect Square");
		sc.close();

	}

}
