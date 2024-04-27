// Abstract Class: TeaMaker
abstract class TeaMaker {
    // Template method that defines the general process of making tea
    public final void makeTea() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addCondiments();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void steepTeaBag();

    protected abstract void addCondiments();

    // Common steps
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

// Concrete Class: BlackTea
class BlackTea extends TeaMaker {
    @Override
    protected void steepTeaBag() {
        System.out.println("Steeping black tea bag");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}

// Concrete Class: GreenTea
class GreenTea extends TeaMaker {
    @Override
    protected void steepTeaBag() {
        System.out.println("Steeping green tea bag");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding honey");
    }
}

// Usage
public class TemplateMethod {
    public static void main(String[] args) {
        TeaMaker blackTea = new BlackTea();
        blackTea.makeTea();
        // Output:
        // Boiling water
        // Steeping black tea bag
        // Pouring into cup
        // Adding lemon

        System.out.println();

        TeaMaker greenTea = new GreenTea();
        greenTea.makeTea();
        // Output:
        // Boiling water
        // Steeping green tea bag
        // Pouring into cup
        // Adding honey
    }
}
