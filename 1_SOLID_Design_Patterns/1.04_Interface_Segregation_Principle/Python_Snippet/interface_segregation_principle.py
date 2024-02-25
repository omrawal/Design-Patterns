# Create a document handler machine that has the following functionality
# 1. Print
# 2. Scan
# 3. Fax

# Violates Interface Segregation Principle

class Machine(object) :
    def print_document(self):
        pass

    def scan_document(self):
        pass

    def fax_document(self):
        pass


class ModernPrinter (Machine):
    def print_document(self):
        print("Printing Document")

    def scan_document(self):
        print("Scanning Document")

    def fax_document(self):
        print("Faxing Document")


class ClassicPrinter (Machine):
    def print_document(self):
        print("Printing Document")

    def scan_document(self):
        print("Oops no Scanner Available")

    def fax_document(self):
        print("Oops no Fax service available")

# it breaks the ISP. ClassicPrinter cannot Scan or Fax documents.

# Complies with Interface Segregation Principle
class Printer(object):
    def print_document(self):
        pass

class Scanner(object):
    def scan(self):
        pass

class FaxMachine(object):
    def fax(self):
        pass

class ModernPrinterMachine (Printer, Scanner, FaxMachine):
    def print_document(self):
        print("Printing Document")

    def scan_document(self):
        print("Scanning Document")

    def fax_document(self):
        print("Faxing Document")


class ClassicPrinterMachine (Printer):
    def print_document(self):
        print("Printing Document")
