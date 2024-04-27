# Visitor Interface
from abc import ABC, abstractmethod

# Element Interface
class Animal(ABC):
    @abstractmethod
    def accept(self, visitor):
        pass

# Concrete Element: Lion
class Lion(Animal):
    def accept(self, visitor):
        visitor.visit_lion(self)

# Concrete Element: Elephant
class Elephant(Animal):
    def accept(self, visitor):
        visitor.visit_elephant(self)

# Concrete Element: Giraffe
class Giraffe(Animal):
    def accept(self, visitor):
        visitor.visit_giraffe(self)

class AnimalVisitor(ABC):
    @abstractmethod
    def visit_lion(self, lion: Lion):
        pass

    @abstractmethod
    def visit_elephant(self, elephant: Elephant):
        pass

    @abstractmethod
    def visit_giraffe(self, giraffe: Giraffe):
        pass

# Concrete Visitor: FeedVisitor
class FeedVisitor(AnimalVisitor):
    def visit_lion(self, lion):
        print("Feeding lion")

    def visit_elephant(self, elephant):
        print("Feeding elephant")

    def visit_giraffe(self, giraffe):
        print("Feeding giraffe")

# Concrete Visitor: SleepVisitor
class SleepVisitor(AnimalVisitor):
    def visit_lion(self, lion):
        print("Putting lion to sleep")

    def visit_elephant(self, elephant):
        print("Putting elephant to sleep")

    def visit_giraffe(self, giraffe):
        print("Putting giraffe to sleep")

# Usage
if __name__ == "__main__":
    lion = Lion()
    elephant = Elephant()
    giraffe = Giraffe()

    feed_visitor = FeedVisitor()
    sleep_visitor = SleepVisitor()

    lion.accept(feed_visitor)  # Output: Feeding lion
    elephant.accept(feed_visitor)  # Output: Feeding elephant
    giraffe.accept(feed_visitor)  # Output: Feeding giraffe

    lion.accept(sleep_visitor)  # Output: Putting lion to sleep
    elephant.accept(sleep_visitor)  # Output: Putting elephant to sleep
    giraffe.accept(sleep_visitor)  # Output: Putting giraffe to sleep
