# Originator
class TextEditor:
    def __init__(self, content):
        self._content = content

    def set_content(self, content):
        self._content = content

    def get_content(self):
        return self._content

    def save(self):
        return TextEditorMemento(self._content)

    def restore(self, memento):
        self._content = memento.get_content()


# Memento
class TextEditorMemento:
    def __init__(self, content):
        self._content = content

    def get_content(self):
        return self._content


# Caretaker
class History:
    def __init__(self):
        self._mementos = []

    def save(self, memento):
        self._mementos.append(memento)

    def undo(self):
        if self._mementos:
            return self._mementos.pop()
        return None


# Usage
if __name__ == "__main__":
    # Create originator (text editor)
    editor = TextEditor("Hello, world!")

    # Create caretaker (history)
    history = History()

    # Save initial state
    history.save(editor.save())

    # Perform some edits
    editor.set_content("Hello, ")
    history.save(editor.save())

    editor.set_content("Hello, Python!")
    history.save(editor.save())

    # Undo to previous state
    editor.restore(history.undo())
    print(editor.get_content())  # Output: Hello, 

    # Undo again
    editor.restore(history.undo())
    print(editor.get_content())  # Output: Hello, world!
