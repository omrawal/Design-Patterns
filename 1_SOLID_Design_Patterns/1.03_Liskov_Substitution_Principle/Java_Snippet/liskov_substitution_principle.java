// Create a birds that can have the following functions
// 1. Walking
// 2. Flying

//  Violates Liskov Substitution Principle
interface Bird {
    public void fly();

    public void walk();
}

class Parrot implements Bird {
    public void fly() {
        System.out.println("Parrot is Flying");
    }

    public void walk() {
        System.out.println("Parrot is Walking");
    }
}

class Penguin implements Bird {
    public void fly() {
        System.out.println("Penguin is Flying! Oops penguins can't fly");
    }

    public void walk() {
        System.out.println("Penguin is Walking");
    }
}

// it's break the principle of LSP. Penguin can not fly.

// Complies with Liskov Substitution Principle
interface BirdSpecies {
    // to do;
}

interface FlyingBird extends BirdSpecies {
    public void fly();
}

interface WalkingBird extends BirdSpecies {
    public void walk();
}

class ParrotBird implements FlyingBird, WalkingBird {
    public void fly() {
        System.out.println("Parrot is Flying");
    }

    public void walk() {
        System.out.println("Parrot is Walking");
    }
}

class PenguinBird implements WalkingBird {
    public void walk() {
        System.out.println("Penguin is Walking");
    }
}