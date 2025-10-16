package com.codegnan.operatorexample;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		System.out.println(num>=0?"Positive Number":"Negative Number");
		sc.close();

	}

}
