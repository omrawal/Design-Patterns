# Abstract Class: TeaMaker
from abc import ABC, abstractmethod

class TeaMaker(ABC):
    # Template method that defines the general process of making tea
    def make_tea(self):
        self.boil_water()
        self.steep_tea_bag()
        self.pour_in_cup()
        self.add_condiments()

    # Abstract methods to be implemented by subclasses
    @abstractmethod
    def steep_tea_bag(self):
        pass

    @abstractmethod
    def add_condiments(self):
        pass

    # Common steps
    def boil_water(self):
        print("Boiling water")

    def pour_in_cup(self):
        print("Pouring into cup")

# Concrete Class: BlackTea
class BlackTea(TeaMaker):
    def steep_tea_bag(self):
        print("Steeping black tea bag")

    def add_condiments(self):
        print("Adding lemon")

# Concrete Class: GreenTea
class GreenTea(TeaMaker):
    def steep_tea_bag(self):
        print("Steeping green tea bag")

    def add_condiments(self):
        print("Adding honey")

# Usage
if __name__ == "__main__":
    black_tea = BlackTea()
    black_tea.make_tea()
    # Output:
    # Boiling water
    # Steeping black tea bag
    # Pouring into cup
    # Adding lemon

    print()

    green_tea = GreenTea()
    green_tea.make_tea()
    # Output:
    # Boiling water
    # Steeping green tea bag
    # Pouring into cup
    # Adding honey
