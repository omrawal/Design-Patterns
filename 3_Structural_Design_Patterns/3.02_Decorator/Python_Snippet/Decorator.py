
class Beverage:
    def __init__(self, description):
        self.description = description

    def get_description(self):
        return self.description

    def cost(self):
        return 0.0

class Espresso(Beverage):
    def __init__(self):
        super().__init__("Espresso")

    def cost(self):
        return 1.99

class Decorator(Beverage):
    def __init__(self, beverage):
        self.beverage = beverage

    def get_description(self):
        return self.beverage.get_description() + " " + self.description

    def cost(self):
        return self.beverage.cost() + self.additional_cost

class Milk(Decorator):
    def __init__(self, beverage):
        super().__init__(beverage)
        self.description = "Milk"
        self.additional_cost = 0.50

class Sugar(Decorator):
    def __init__(self, beverage):
        super().__init__(beverage)
        self.description = "Sugar"
        self.additional_cost = 0.25

class WhippedCream(Decorator):
    def __init__(self, beverage):
        super().__init__(beverage)
        self.description = "Whipped Cream"
        self.additional_cost = 1.00