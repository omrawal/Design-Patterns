# Create a document handler machine that has the following functionality
# 1. Print
# 2. Scan
# 3. Fax

# Violates Interface Segregation Principle

class Machine(object) :
    def print_document():
        pass

    def scan_document():
        pass

    def fax_document():
        pass


class ModernPrinter (Machine):
    def print_document():
        print("Printing Document")

    def scan_document():
        print("Scanning Document")

    def fax_document():
        print("Faxing Document")


class ClassicPrinter (Machine):
    def print_document():
        print("Printing Document")

    def scan_document():
        print("Oops no Scanner Available")

    def fax_document():
        print("Oops no Fax service available")

# it breaks the ISP. ClassicPrinter cannot Scan or Fax documents.

# Complies with Interface Segregation Principle
class Printer(object):
    def print_document():
        pass

class Scanner(object):
    def scan():
        pass

class FaxMachine(object):
    def fax():
        pass

class ModernPrinterMachine (Printer, Scanner, FaxMachine):
    def print_document():
        print("Printing Document")

    def scan_document():
        print("Scanning Document")

    def fax_document():
        print("Faxing Document")


class ClassicPrinterMachine (Printer):
    def print_document():
        print("Printing Document")
