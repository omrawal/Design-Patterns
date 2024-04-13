from abc import ABC, abstractmethod

class Car(ABC):
    @abstractmethod
    def drive(self):
        pass

class Sedan(Car):
    def drive(self):
        print("Driving Sedan")

class SUV(Car):
    def drive(self):
        print("Driving SUV")

class CarFactory:
    def get_car(self, car_type):
        if car_type == "Sedan":
            return Sedan()
        elif car_type == "SUV":
            return SUV()
        else:
            raise ValueError("Invalid car type")

factory = CarFactory()
car1 = factory.get_car("Sedan")
car1.drive()  # Output: Driving Sedan

car2 = factory.get_car("SUV")
car2.drive()  # Output: Driving SUV