interface Beverage {
    String getDescription();

    double getCost();
}

class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}

abstract class Decorator implements Beverage {
    private final Beverage beverage;

    abstract String getDecoratorDescription();

    abstract double getAdditionalCost();

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " " + getDecoratorDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost() + getAdditionalCost();
    }
}

class Milk extends Decorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    String getDecoratorDescription() {
        return "Milk";
    }

    @Override
    double getAdditionalCost() {
        return 0.50;
    }

}

class Sugar extends Decorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    String getDecoratorDescription() {
        return "Sugar";
    }

    @Override
    double getAdditionalCost() {
        return 0.25;
    }
}

class WhippedCream extends Decorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    String getDecoratorDescription() {
        return "Whipped Cream";
    }

    @Override
    double getAdditionalCost() {
        return 1.00;
    }
}