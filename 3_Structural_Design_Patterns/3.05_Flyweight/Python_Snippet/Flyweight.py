class Character:
    def __init__(self, character, font, size, color):
        self.character = character
        self.font = font
        self.size = size
        self.color = color

    def display(self):
        print(f"Character: {self.character}, Font: {self.font}, Size: {self.size}, Color: {self.color}")

class CharacterFactory:
    _characters = {}

    @staticmethod
    def get_character(character, font, size, color):
        key = (character, font, size, color)
        if key not in CharacterFactory._characters:
            CharacterFactory._characters[key] = Character(character, font, size, color)
        return CharacterFactory._characters[key]

# Example usage:
factory = CharacterFactory()

char1 = factory.get_character('A', 'Arial', 12, 'Black')
char1.display()  # Output: Character: A, Font: Arial, Size: 12, Color: Black

char2 = factory.get_character('B', 'Times New Roman', 14, 'Red')
char2.display()  # Output: Character: B, Font: Times New Roman, Size: 14, Color: Red

char3 = factory.get_character('A', 'Arial', 12, 'Black')  # Reusing existing 'A' character object
char3.display()  # Output: Character: A, Font: Arial, Size: 12, Color: Black
