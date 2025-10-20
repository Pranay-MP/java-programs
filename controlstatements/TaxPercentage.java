package com.codegnan.controlstatements;

import java.util.Scanner;

public class TaxPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Price: ");
		int income= sc.nextInt();
		if (income< 10000) System.out.println("tax 0%");
		else if(income>10000&&income<50000) System.out.println("tax: 10%");
		else if(income>50000&&income<100000) System.out.println("tax: 20%");	
		else System.out.println("tax: 30%");
		sc.close();
		

	}

}
