package com.codegnan.operatorexample;

import java.util.Scanner;

public class NestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Amount: ");
		int amt= sc.nextInt();
		double dis=  amt>=100 ? amt*0.2:
						amt>=50? amt*0.1:0;
		double total_amt=amt-dis;
		System.out.println("Discount: "+dis);
		System.out.println("Total Amount: "+total_amt);
		sc.close();

	}

}
