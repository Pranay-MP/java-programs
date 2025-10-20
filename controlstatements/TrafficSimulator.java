package com.codegnan.controlstatements;

import java.util.Scanner;

public class TrafficSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter light Status(red,yellow,green): ");
		String light=sc.next();
		System.out.println("enter time in 24 hours: ");
		double time= sc.nextDouble();
		String action ;
		boolean isDayTime=(time>=6&&time<=6);
		if (light.equalsIgnoreCase("red")) {
			action="Stop";
		}else {
			if (light.equalsIgnoreCase("yellow")) {
				if(isDayTime) {
					action="slow";
				}else {
					action="Stop";
				}
			}else {
				if(light.equalsIgnoreCase("green")) {
					action ="Go";
				}else {
				action="Invalid Light State";
				}
			}
		}
		System.out.println(action);
		sc.close();

	}

}
