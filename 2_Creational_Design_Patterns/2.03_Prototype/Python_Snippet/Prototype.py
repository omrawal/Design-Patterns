import copy

# Prototype class for cakes
class CakePrototype:
    def clone(self):
        # This method will be overridden by subclasses
        pass

    def describe(self):
        # This method will be overridden by subclasses
        pass

# Concrete prototype for a basic cake
class BasicCake(CakePrototype):
    def __init__(self, flavor, layers):
        self.flavor = flavor
        self.layers = layers

    def clone(self):
        return copy.deepcopy(self)

    def describe(self):
        print(f"A basic {self.flavor} cake with {self.layers} layers")

# Concrete prototype for a decorated cake
class DecoratedCake(CakePrototype):
    def __init__(self, base_cake, decorations):
        self.base_cake = base_cake
        self.decorations = decorations

    def clone(self):
        # Cloning the base cake and then adding decorations
        cloned_cake = self.base_cake.clone()
        cloned_cake.decorations = self.decorations
        return cloned_cake

    def describe(self):
        print("A decorated cake:")
        self.base_cake.describe()
        print("Decorations:", self.decorations)

# Example usage
basic_chocolate_cake = BasicCake("chocolate", 2)
basic_vanilla_cake = BasicCake("vanilla", 3)

# Cloning a basic cake and adding decorations
decorated_chocolate_cake = DecoratedCake(basic_chocolate_cake, ["chocolate shavings", "strawberries"])

basic_chocolate_cake.describe()
decorated_chocolate_cake.describe()