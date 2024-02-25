# Create an employee directory where a manager has the following reportees
# 1. Developer
# 2. Desginer
# 3. Tester

# Violates Dependency Inversion Principle


class Developer(object):
    def work(self):
        print("Developer is Coding amazing stuff")
    


class Designer(object):
    def work(self):
        print("Designer is choosing a background color for the website")
        # :P no offence to designers
    


class Tester(object):
    def work(self):
        print("Tester is making Developer's life difficult")
        # :P no offence to testers
    


class Manager(object):
    def __init__(self) :
        self.developers = []
        self.designers = []
        self.testers = []
    

    def hireDeveloper(self, developer) :
        self.developers.append(developer)
    

    def hireDesigner(self, designer) :
        self.designers.append(designer)
    

    def hireTester(self, tester) :
        self.testers.append(tester)
    


# it breaks the DIP. A new type of employee i.e. ML Engineer
# cannot be added without changeing Manager class.

# Complies with Interface Segregation Principle
class Employee(object):
    def work(self):
        pass


class eManager(object):
    def manager(self) :
        self.employees = []
    
    def hireEmployee(self,employee) :
        self.employees.append(employee)
    


class eDeveloper(Employee):
    def work(self) :
        print("Developer is Coding amazing stuff")
    


class eDesigner(Employee):
    def work(self) :
        print("Designer is choosing a background color for the website")
        # :P no offence to designers
    


class eTester(Employee):
    def work() :
        print("Tester is making Developer's life difficult")
        # :P no offence to testers
    
