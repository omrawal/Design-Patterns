'''
Create a helper that can 
1. Drive
2. Water the plants
3. Clean the house
4. cook delicious food 
'''

# Violates Single Responsibility Principle

class Helper(object):
    def __init__(self):
        print("Helper Initialised")

    def __str__(self):
        return f'I am helper, I can drive, cook, clean and take care of plants'

    def drive(self):
        print("I am  Driving")
    
    def clean(self):
        print("I am Cleaning")
    
    def cook(self):
        print("I am Cooking")
    
    def water_the_plants(self):
        print("I am watering the plants")

# Complies with Single Responsibility Principle

class Driver(object):
    def drive(self):
        print("I am  Driving")

class Cleaner(object):
    def clean(self):
        print("I am Cleaning")

class Chef(object):
    def cook(self):
        print("I am Cooking")

class Gardener(object):
    def water_the_plants(self):
        print("I am watering the plants")
