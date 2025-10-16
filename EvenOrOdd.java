package com.codegnan.operatorexample;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input values");
		int n=sc.nextInt();
		System.out.println(n%2==0?"even":"odd");
		sc.close();
		

	}
	

}
