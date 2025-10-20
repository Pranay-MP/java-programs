package com.codegnan.operatorexample;

import java.util.Scanner;

public class ParkingFee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter time in hour: ");
		int time=sc.nextInt();
		double fee= time<=3? time*2: 3*2+time-3;
		System.out.println("Parking Charge: "+fee);
		sc.close();
	}
}
