// Visitor Interface
interface AnimalVisitor {
    void visit(Lion lion);

    void visit(Elephant elephant);

    void visit(Giraffe giraffe);
}

// Element Interface
interface Animal {
    void accept(AnimalVisitor visitor);
}

// Concrete Element: Lion
class Lion implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Element: Elephant
class Elephant implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Element: Giraffe
class Giraffe implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Visitor: FeedVisitor
class FeedVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Feeding lion");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Feeding elephant");
    }

    @Override
    public void visit(Giraffe giraffe) {
        System.out.println("Feeding giraffe");
    }
}

// Concrete Visitor: SleepVisitor
class SleepVisitor implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Putting lion to sleep");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Putting elephant to sleep");
    }

    @Override
    public void visit(Giraffe giraffe) {
        System.out.println("Putting giraffe to sleep");
    }
}

// Usage
public class Visitor {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal giraffe = new Giraffe();

        AnimalVisitor feedVisitor = new FeedVisitor();
        AnimalVisitor sleepVisitor = new SleepVisitor();

        lion.accept(feedVisitor); // Output: Feeding lion
        elephant.accept(feedVisitor); // Output: Feeding elephant
        giraffe.accept(feedVisitor); // Output: Feeding giraffe

        lion.accept(sleepVisitor); // Output: Putting lion to sleep
        elephant.accept(sleepVisitor); // Output: Putting elephant to sleep
        giraffe.accept(sleepVisitor); // Output: Putting giraffe to sleep
    }
}
