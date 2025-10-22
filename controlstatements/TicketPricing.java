package com.codegnan.controlstatements;

import java.util.Scanner;

public class TicketPricing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter passanger type (adult,child,senior): ");
		String passanger=sc.nextLine();
		System.out.println("Enter booking time(early,normal,last minute): ");
		String booking_time=sc.nextLine();
		System.out.println("Enter price: ");
		double price=sc.nextDouble();
		System.out.println("Enter membership status(yes/no): ");
		String membership=sc.next();
		if (passanger.equalsIgnoreCase("child")) {
			price*=0.5;
		}else if (passanger.equalsIgnoreCase("senior")){
			price*=0.8;
		}else if(passanger.equalsIgnoreCase("adult")) {
			
		}else {
			System.out.println("invalid passanger type");
		}
		if(booking_time.equalsIgnoreCase("early")) price*=0.9;
		else if(booking_time.equalsIgnoreCase("last minute")) price*=1.20;
		else if (booking_time.equalsIgnoreCase("normal"));
		else System.out.println("booking time invalid");
		if (membership.equalsIgnoreCase("yes")) price*=0.9;
		else ;
		System.out.println("Total Ticket Price: "+price);
		
		
		sc.close();
	} 

}

