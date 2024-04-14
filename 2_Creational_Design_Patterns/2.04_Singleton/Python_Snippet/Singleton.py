class Printer():
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(Printer,cls).__new__(cls)
        return cls._instance
    
    def print_document(self,document):
        print("Printing ",document)
    
printer1 = Printer()
printer2 = Printer()

print(printer1 is printer2)

printer1.print_document('Document 1')
printer2.print_document('Document 2')