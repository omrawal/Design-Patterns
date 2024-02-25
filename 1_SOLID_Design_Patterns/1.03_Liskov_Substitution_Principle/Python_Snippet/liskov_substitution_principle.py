# Create a birds that can have the following functions
# 1. Walking
# 2. Flying

# Violates Liskov Substitution Principle
class Bird(object):
    def fly():
        pass
    def walk():
        pass

class Parrot(Bird):
    def fly():
        print("Parrot is Flying")
    def walk():
        print("Parrot is Walking")

class Penguin(Bird):
    def fly():
        print("Penguin is Flying! Oops penguins can't fly")
    def walk():
        print("Penguin is Walking")

# it's break the principle of LSP. Penguin can not fly.

# Complies with Liskov Substitution Principle
class BirdSpecies(object):
    pass

class FlyingBird(BirdSpecies):
    def fly():
        pass

class WalkingBird(BirdSpecies):
    def walk():
        pass

class Parrot(FlyingBird,WalkingBird):
    def fly():
        print("Parrot is Flying")
    def walk():
        print("Parrot is Walking")

class Penguin(WalkingBird):
    def walk():
        print("Penguin is Walking")