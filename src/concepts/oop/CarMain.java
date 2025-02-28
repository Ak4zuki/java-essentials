package concepts.oop;

import concepts.oop.examples.Car;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println("R" + car.price);
        car.stop();
    }
}
