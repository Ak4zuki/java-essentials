package concepts.oop;

import concepts.oop.examples.Car;

public class ObjectArrays {
    public static void main(String[] args) {

        Car[] cars = {new Car("MK4 Supra", "White"), new Car("R34 Skyline", "Blue"), new Car("RX 7", "Orange")};

        for (Car car : cars) {
            car.drive();
        }
    }
}
