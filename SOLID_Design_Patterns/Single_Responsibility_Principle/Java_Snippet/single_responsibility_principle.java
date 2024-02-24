// Create a helper that can 
// 1. Drive
// 2. Water the plants
// 3. Clean the house
// 4. cook delicious food 

// Violates Single Responsibility Principle
class Helper {
    public void helper() {
        System.out.println("Helper Initialised");
    }

    public String toString() {
        return "I am helper, I can drive, cook, clean and take care of plants";
    }

    public void drive() {
        System.out.println("I am  Driving");
    }

    public void clean() {
        System.out.println("I am  Cleaning");
    }

    public void cook() {
        System.out.println("I am  Cooking");
    }

    public void water_the_plants() {
        System.out.println("I am  watering the plants");
    }
}

// Complies with Single Responsibility Principle
class Driver {
    public void drive() {
        System.out.println("I am  Driving");
    }
}

class Cleaner {
    public void clean() {
        System.out.println("I am  Cleaning");
    }
}

class Chef {
    public void cook() {
        System.out.println("I am  Cooking");
    }
}

class Gardener {
    public void water_the_plants() {
        System.out.println("I am  watering the plants");
    }
}