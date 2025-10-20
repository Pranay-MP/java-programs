package com.codegnan.controlstatements;

import java.util.Scanner;

public class ATMwithdrawal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter withdraw amount: ");
		int amt=sc.nextInt();
		double balance=10000;
		if (amt<balance) {
			balance -= amt;
			System.out.println("Withdrawal Succussfully");
			System.out.println("Remaining Amount: "+balance);
		}else {
			System.out.println("Insufficient Funds");
			
		}sc.close();
	}

}
