package com.codegnan.controlstatements;

import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter weight in kgs: ");
		double weight=sc.nextDouble();
		System.out.println("Enter Height in meters: ");
		double height=sc .nextDouble();
		double BMI= weight / (height * height);
		String category;
		if (BMI<18.5) category="Under Weight";
		else if(BMI>18.5&&BMI<25) category="Normal";
		else if (BMI>25&& BMI<30) category="Over Weight";
		else category="Obese";
		System.out.printf("BMI: %.2f\n",BMI);
		System.out.println("Category: "+category);
		sc.close();
		
	}
}
