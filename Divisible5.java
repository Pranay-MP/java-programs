package com.codegnan.operatorexample;

import java.util.Scanner;

public class Divisible5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		System.out.println(num%5==0?"The " +num+" is divisible by 5":"The"+num+" is does not divisible by 5");
		sc.close();

	}
}
