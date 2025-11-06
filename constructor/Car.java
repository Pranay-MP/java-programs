package com.codegnan.constructor;

public class Car {
    // Instance Variables
    private String brand;
    private String model;
    private double rentalPricePerDay;

    // Constructor with validation
    public Car(String brand, String model, double rentalPricePerDay) throws Exception {
        if (brand == null || brand.trim().isEmpty()) {
            throw new Exception("Brand cannot be empty");
        }
        if (model == null || model.trim().isEmpty()) {
            throw new Exception("Model cannot be empty");
        }
        if (rentalPricePerDay <= 0) {
            throw new Exception("Rental price must be positive");
        }

        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public void displayCarInfo() {
        System.out.printf("Brand: %s, Model: %s, Price per Day: %.2f%n",
                          brand, model, rentalPricePerDay);
    }
}
