class Printer {
    private static Printer instance;

    // Private constructor to prevent instantiation from outside
    private Printer() {
        // Initialize printer settings here
    }

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void printDocument(String document) {
        // Simulate printing
        System.out.println("Printing: " + document);
    }

    // Optional: to prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // Optional: to prevent deserialization
    protected Object readResolve() {
        return getInstance();
    }
}

// Usage
public class Singleton {
    public static void main(String[] args) {
        Printer printer1 = Printer.getInstance();
        Printer printer2 = Printer.getInstance();

        // Both printer1 and printer2 are references to the same object
        System.out.println(printer1 == printer2); // Output: true

        printer1.printDocument("Document 1");
        printer2.printDocument("Document 2");
    }
}