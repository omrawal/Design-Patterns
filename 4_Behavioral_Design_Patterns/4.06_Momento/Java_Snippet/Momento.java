import java.util.Stack;

// Originator
class TextEditor {
    private String content;

    public TextEditor(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(content);
    }

    public void restore(TextEditorMemento memento) {
        this.content = memento.getContent();
    }
}

// Memento
class TextEditorMemento {
    private String content;

    public TextEditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// Caretaker
class History {
    private Stack<TextEditorMemento> mementos = new Stack<>();

    public void save(TextEditorMemento memento) {
        mementos.push(memento);
    }

    public TextEditorMemento undo() {
        if (!mementos.isEmpty()) {
            return mementos.pop();
        }
        return null;
    }
}

// Usage
public class Momento {
    public static void main(String[] args) {
        // Create originator (text editor)
        TextEditor editor = new TextEditor("Hello, world!");

        // Create caretaker (history)
        History history = new History();

        // Save initial state
        history.save(editor.save());

        // Perform some edits
        editor.setContent("Hello, ");
        history.save(editor.save());

        editor.setContent("Hello, Java!");
        history.save(editor.save());

        // Undo to previous state
        editor.restore(history.undo());
        System.out.println(editor.getContent()); // Output: Hello,

        // Undo again
        editor.restore(history.undo());
        System.out.println(editor.getContent()); // Output: Hello, world!
    }
}
