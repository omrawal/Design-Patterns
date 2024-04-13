// Interface representing a Car
interface Car {
    void drive();
}

// Sedan implementation of the Car interface
class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Sedan");
    }
}

// SUV implementation of the Car interface
class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving SUV");
    }
}

// Car factory class
class CarFactory {

    // Factory method to create a Car object based on type
    public Car getCar(String carType) {
        if (carType.equals("Sedan")) {
            return new Sedan();
        } else if (carType.equals("SUV")) {
            return new SUV();
        } else {
            throw new IllegalArgumentException("Invalid car type");
        }
    }
}

public class Factory {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car car1 = factory.getCar("Sedan");
        car1.drive(); // Output: Driving Sedan

        Car car2 = factory.getCar("SUV");
        car2.drive(); // Output: Driving SUV
    }
}