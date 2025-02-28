package service;

public class Car {

    public String make = "Toyota";
    public String model = "Mk4 Supra";
    public int year = 2002;
    public double price = 1000000;
    public boolean isRunning;

    public void start() {
        isRunning = true;
        System.out.println("You started the car");
    }

    public void stop() {
        isRunning = false;
        System.out.println("You switched off the car ");
    }

    public void drive() {
        isRunning = true;
        System.out.println("The car is driving");
    }

    public void brake() {
        isRunning = false;
        System.out.println("You stopped the car");
    }
}
