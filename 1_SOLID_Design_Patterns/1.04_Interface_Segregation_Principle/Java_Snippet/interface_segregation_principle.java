// Create a document handler machine that has the following functionality
// 1. Print
// 2. Scan
// 3. Fax

// Violates Interface Segregation Principle

interface Machine {
    public void print_document();

    public void scan_document();

    public void fax_document();
}

class ModernPrinter implements Machine {
    @Override
    public void print_document() {
        System.out.println("Printing Document");
    }

    @Override
    public void scan_document() {
        System.out.println("Scanning Document");
    }

    @Override
    public void fax_document() {
        System.out.println("Faxing Document");
    }
}

class ClassicPrinter implements Machine {
    @Override
    public void print_document() {
        System.out.println("Printing Document");
    }

    @Override
    public void scan_document() {
        System.out.println("Oops no Scanner Available");
    }

    @Override
    public void fax_document() {
        System.out.println("Oops no Fax service available");
    }
}
// it breaks the ISP. ClassicPrinter cannot Scan or Fax documents.

// Complies with Interface Segregation Principle
interface Printer {
    public void print_document();
}

interface Scanner {
    public void scan_document();
}

interface FaxMachine {
    public void fax_document();
}

class ModernPrinterMachine implements Printer, Scanner, FaxMachine {
    @Override
    public void print_document() {
        System.out.println("Printing Document");
    }

    @Override
    public void scan_document() {
        System.out.println("Scanning Document");
    }

    @Override
    public void fax_document() {
        System.out.println("Faxing Document");
    }
}

class ClassicPrinterMachine implements Printer {
    @Override
    public void print_document() {
        System.out.println("Printing Document");
    }
}