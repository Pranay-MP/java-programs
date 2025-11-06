package com.codegnan.constructor;

import java.util.Scanner;

public class Vehicle {
    String vehicleNo;
    String brand;
    double fuelConsumed;
    double distanceTravelled;
    double mileage;

    public Vehicle() {
        this("Unknown", "Unknown", 0.0, 0.0);
    }

    public Vehicle(String vehicleNo, String brand, double fuelConsumed, double distanceTravelled) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.fuelConsumed = fuelConsumed;
        this.distanceTravelled = distanceTravelled;

        if (fuelConsumed > 0) {
            this.mileage = distanceTravelled / fuelConsumed;
        } else {
            this.mileage = 0.0; 
        }
    }

    public void showDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Vehicle No: " + this.vehicleNo);
        System.out.println("Brand: " + this.brand);
        System.out.println("Fuel Consumed: " + this.fuelConsumed);
        System.out.println("Distance Travelled: " + this.distanceTravelled);
        System.out.println("Mileage: " + this.mileage + " km/l");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vehicleNo = sc.next();
        String brand = sc.next();
        double fuelConsumed = sc.nextDouble();
        double distanceTravelled = sc.nextDouble();

        Vehicle v = new Vehicle(vehicleNo, brand, fuelConsumed, distanceTravelled);
        v.showDetails();

        sc.close();
    }
}
