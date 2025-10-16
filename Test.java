package com.codegnan.operatorexample;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10,b=20,c=30;
//		String d="codegnan";
//		System.out.println(a+b+c+d);
//		System.out.println(b+c+d+a);
//		System.out.println(c+d+a+b);
//		System.out.println(d+a+b+c);
		
//		int x=10;
//		int y=0;
//		System.out.println(y=++x);
//		System.out.println(y=x++);
//		System.out.println(y=--x);
//		System.out.println(y=x--);
//		System.out.println(10<20);
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter age: ");
		int age = sc.nextInt();
		String result=age>18?"Eligible to Vote": "Not Eligible to vote";
		System.out.println(result);
		sc.close();
		
		}

}
