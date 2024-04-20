from abc import ABC, abstractmethod

class FileSystem(ABC):
    @abstractmethod
    def display_info(self):
        pass

class File(FileSystem):
    def __init__(self, name, contents):
        self.name = name
        self.contents = contents

    def display_info(self):
        print(f"File: {self.name}, Contents: {self.contents}")

class Directory(FileSystem):
    def __init__(self, name):
        self.name = name
        self.children = []

    def add_child(self, child):
        self.children.append(child)

    def display_info(self):
        print(f"Directory: {self.name}")
        for child in self.children:
            child.display_info()

# Usage
if __name__ == "__main__":
    base_dir = Directory("home")
    hack_file = File("hack.txt", "Hacking NASA with HTML")
    hack_dir = Directory("hack")
    html_file = File("index.html", "<h1>Welcome to NASA</h1>")
    base_dir.add_child(html_file)
    base_dir.add_child(hack_dir)
    hack_dir.add_child(hack_file)
    base_dir.display_info()