package com.codegnan.controlstatements;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int input=sc.nextInt();
		if (input>0) {
			System.out.println("positve number");
			
		}
		sc.close();

	}

}
