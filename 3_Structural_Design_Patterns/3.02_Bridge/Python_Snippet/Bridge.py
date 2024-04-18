# Abstraction (Painting Tool)
class PaintingTool:
    def __init__(self, color):
        self.color = color

    def apply_color(self):
        raise NotImplementedError("Subclasses must implement apply_color")

# Concrete Implementations (Painting Tools)
class Brush(PaintingTool):
    def apply_color(self):
        print(f"Applying {self.color.get_color()} with a brush")

class Roller(PaintingTool):
    def apply_color(self):
        print(f"Applying {self.color.get_color()} with a roller")

class Sprayer(PaintingTool):
    def apply_color(self):
        print(f"Applying {self.color.get_color()} with a sprayer")

# Abstraction (Color)
class Color:
    def get_color(self):
        raise NotImplementedError("Subclasses must implement get_color")

# Concrete Implementations (Colors)
class Red(Color):
    def get_color(self):
        return "Red"

class Blue(Color):
    def get_color(self):
        return "Blue"

class Green(Color):
    def get_color(self):
        return "Green"

# Usage (Client - Painter)
def main():
    brush = Brush(Red())
    brush.apply_color()  # Output: Applying Red with a brush

    roller = Roller(Blue())
    roller.apply_color()  # Output: Applying Blue with a roller

    sprayer = Sprayer(Green())
    sprayer.apply_color()  # Output: Applying Green with a sprayer

if __name__ == "__main__":
    main()