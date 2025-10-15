package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleCompoundintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principle Amount: ");
		double p=sc.nextDouble();
		System.out.print("Enter Rate Of Intrest in % : ");
		double r=sc.nextDouble();
		System.out.print("Enter Time Period in Years: ");
		double t=sc.nextDouble();
		double s_intrest=p*t*r/100;
		double s_total_amount=p+s_intrest;
		double c_total_amount=p*Math.pow((1+r/100),t);
		double c_intrest=c_total_amount-p;
		System.out.println("Simple Intrest: "+s_intrest);
		System.out.println("Total Amount with simple intrest: "+s_total_amount);
		System.out.println("compound intrest: "+c_intrest);
		System.out.println("Total amount with compound intrest: "+c_total_amount);
		sc.close();

	}

}
