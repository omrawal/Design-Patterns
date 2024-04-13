import java.util.ArrayList;
import java.util.List;

// Prototype interface for cakes
interface CakePrototype {
    CakePrototype clone();

    void describe();
}

// Concrete prototype for a basic cake
class BasicCake implements CakePrototype {
    private String flavor;
    private int layers;

    public BasicCake(String flavor, int layers) {
        this.flavor = flavor;
        this.layers = layers;
    }

    @Override
    public CakePrototype clone() {
        return new BasicCake(flavor, layers);
    }

    @Override
    public void describe() {
        System.out.println("A basic " + flavor + " cake with " + layers + " layers");
    }
}

// Concrete prototype for a decorated cake
class DecoratedCake implements CakePrototype {
    private CakePrototype baseCake;
    private List<String> decorations;

    public DecoratedCake(CakePrototype baseCake, List<String> decorations) {
        this.baseCake = baseCake;
        this.decorations = new ArrayList<>(decorations);
    }

    @Override
    public CakePrototype clone() {
        List<String> clonedDecorations = new ArrayList<>(decorations);
        return new DecoratedCake(baseCake.clone(), clonedDecorations);
    }

    @Override
    public void describe() {
        System.out.println("A decorated cake:");
        baseCake.describe();
        System.out.println("Decorations: " + decorations);
    }
}

// Example usage
public class Prototype {
    public static void main(String[] args) {
        BasicCake basicChocolateCake = new BasicCake("chocolate", 2);
        BasicCake basicVanillaCake = new BasicCake("vanilla", 3);

        // Cloning a basic cake and adding decorations
        List<String> decorations = new ArrayList<>();
        decorations.add("chocolate shavings");
        decorations.add("strawberries");
        DecoratedCake decoratedChocolateCake = new DecoratedCake(basicChocolateCake, decorations);

        basicChocolateCake.describe();
        decoratedChocolateCake.describe();
    }
}