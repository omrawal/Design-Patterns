from abc import ABC, abstractmethod

# Interface
class Image(ABC):
    @abstractmethod
    def display(self):
        pass

# Real subject
class RealImage(Image):
    def __init__(self, filename):
        self.filename = filename
        self.load_image_from_disk()

    def load_image_from_disk(self):
        print("Loading image:", self.filename)

    def display(self):
        print("Displaying image:", self.filename)

# Proxy
class ProxyImage(Image):
    def __init__(self, filename):
        self.filename = filename
        self.real_image = None

    def display(self):
        if self.real_image is None:
            self.real_image = RealImage(self.filename)
        self.real_image.display()

# Client code
if __name__ == "__main__":
    image = ProxyImage("example.jpg")

    # Image will be loaded from disk only when display() is called
    image.display()

    # Image will not be loaded again, as it has been cached in the Proxy
    image.display()
