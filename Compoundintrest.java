package com.codegnan.fundamentals;

import java.util.Scanner;
public class Compoundintrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principle Amount: ");
		double p=sc.nextDouble();
		System.out.print("Enter Rate Of Intrest in % : ");
		double r=sc.nextDouble();
		System.out.print("Enter Time Period in Years: ");
		double t=sc.nextDouble();
		
		double total_amount=p*Math.pow((1+r/100),t);
		double c_intrest=total_amount-p;
		System.out.println("Compound Intrest: "+ c_intrest);
		System.out.println("Total Amount: "+total_amount);
		sc.close();

	}

}
