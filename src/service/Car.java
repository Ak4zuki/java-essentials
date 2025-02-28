package service;

public class Car {

    String make = "Toyota";
    String model = "Mk4 Supra";
    int year = 2002;
    double price = 1000000;
    boolean isRunning;

    void start(){
        isRunning = true;
        System.out.println("You started the car");
    }
    void stop(){
        isRunning = false;
        System.out.println("You switched off the car ");
    }
    void drive(){
        isRunning = true;
        System.out.println("The car is driving");
    }
    void brake(){
        isRunning = false;
        System.out.println("You stopped the car");
    }
}
