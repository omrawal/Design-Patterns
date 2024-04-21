import java.util.*;

interface Character {
    void display();
}

class ConcreteCharacter implements Character {
    private final char character;
    private final String font;
    private final int size;
    private final String color;

    public ConcreteCharacter(char character, String font, int size, String color) {
        this.character = character;
        this.font = font;
        this.size = size;
        this.color = color;
    }

    @Override
    public void display() {
        System.out.println("Character: " + character + ", Font: " + font + ", Size: " + size + ", Color: " + color);
    }
}

class CharacterFactory {
    private static final Map<String, Character> characters = new HashMap<>();

    public static Character getCharacter(char character, String font, int size, String color) {
        String key = character + font + size + color;
        if (!characters.containsKey(key)) {
            characters.put(key, new ConcreteCharacter(character, font, size, color));
        }
        return characters.get(key);
    }
}

public class Flyweight {
    public static void main(String[] args) {
        Character char1 = CharacterFactory.getCharacter('A', "Arial", 12, "Black");
        char1.display(); // Output: Character: A, Font: Arial, Size: 12, Color: Black

        Character char2 = CharacterFactory.getCharacter('B', "Times New Roman", 14, "Red");
        char2.display(); // Output: Character: B, Font: Times New Roman, Size: 14, Color: Red

        Character char3 = CharacterFactory.getCharacter('A', "Arial", 12, "Black"); // Reusing existing 'A' character
                                                                                    // object
        char3.display(); // Output: Character: A, Font: Arial, Size: 12, Color: Black
    }
}