package com.codegnan.controlstatements;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int input=sc.nextInt();
		if (input>0) {
			System.out.println("positve number");
			
		}else {
			System.out.println("nagative number");
		}
		sc.close();

	}

}
