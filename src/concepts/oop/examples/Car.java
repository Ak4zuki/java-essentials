package concepts.oop.examples;

public class Car {

    public String make;
    public String model;
    public String color;
    public int year;
    public double price;
    public boolean isRunning;

    public Car(){}

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.year = 2002;
        this.price = 100;
        this.isRunning = true;
    }

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
        System.out.println("The car is driving the " + color + " " + model);
    }

    public void brake() {
        isRunning = false;
        System.out.println("You stopped the car");
    }

}