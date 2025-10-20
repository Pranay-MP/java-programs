package com.codegnan.operatorexample;

import java.util.Scanner;

public class TaxiRide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in Km: ");
		int dis= sc.nextInt();
		double amt= dis<=2? 50:
					dis <=10 ? 50+(dis-2)*15:
					50+(8*15)+(dis-10)*10;
		amt =dis>=20? amt*0.95:amt;
						
		System.out.println(amt);
		sc.close();
		
	}

}
