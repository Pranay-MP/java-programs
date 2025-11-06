package com.codegnan.constructor;

import java.util.Scanner;

public class Loan {
	int loanId;
	String customerName;
	double loanAmount;
	String loanType;
	double loan;
	public Loan() {
		this(0,"unknown",0.0,"unknown");
	}
	public Loan(int loanId, String customerName, double loanAmount, String loanType ) {
		this.loanId=loanId;
		this.customerName=customerName;
		this.loanAmount=loanAmount;
		this.loanType=loanType;
		if(loanType.equalsIgnoreCase("home")) {
			loan=loanAmount*1.08;
		}else if (loanType.equalsIgnoreCase("personal")) {
			
			loan=loanAmount*1.11;
		}
		else if(loanType.equalsIgnoreCase("car")) {
			
			loan=loanAmount*1.09;
		}
		else {
			System.out.println("Invalid Input");
		}
		
		
	}
	public void showDetails() {
		System.out.println("--------Loan Details----------\n");
		System.out.println("Loan ID			: "+loanId);
		System.out.println("Customer Name\t	: "+customerName);
		System.out.println("Loan Amount		: "+loanAmount);
		System.out.println("Loan Type		: "+loanType);
		System.out.println("Total Payable \t	: "+loan);
		
	}public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int loanId=sc.nextInt();
		String customerName=sc.next();
		double loanAmount=sc.nextDouble();
		String loanType=sc.next();
		Loan l=new Loan(loanId, customerName, loanAmount, loanType);
		l.showDetails();
		sc.close();
	}
}
