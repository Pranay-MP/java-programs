package com.codegnan.constructor;

import java.util.*;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand = sc.nextLine();
        String model = sc.nextLine();
        double price = sc.nextDouble();

        try {
            Car car = new Car(brand, model, price);
            car.displayCarInfo();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
