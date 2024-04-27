# Observer Interface
class Observer:
    def update(self, weather):
        pass

# Subject Interface
class Subject:
    def add_observer(self, observer):
        pass
    
    def remove_observer(self, observer):
        pass
    
    def notify_observers(self):
        pass

# ConcreteSubject Class
class WeatherStation(Subject):
    def __init__(self):
        self.observers = []
        self.weather = ""
    
    def add_observer(self, observer):
        self.observers.append(observer)
    
    def remove_observer(self, observer):
        self.observers.remove(observer)
    
    def notify_observers(self):
        for observer in self.observers:
            observer.update(self.weather)
    
    def set_weather(self, new_weather):
        self.weather = new_weather
        self.notify_observers()

# ConcreteObserver Class
class PhoneDisplay(Observer):
    def update(self, weather):
        self.weather = weather
        self.display()

    def display(self):
        print("Phone Display: Weather updated -", self.weather)

# ConcreteObserver Class
class TVDisplay(Observer):
    def update(self, weather):
        self.weather = weather
        self.display()

    def display(self):
        print("TV Display: Weather updated -", self.weather)

# Usage
if __name__ == "__main__":
    weather_station = WeatherStation()
    phone_display = PhoneDisplay()
    tv_display = TVDisplay()

    weather_station.add_observer(phone_display)
    weather_station.add_observer(tv_display)

    # Simulating weather change
    weather_station.set_weather("Sunny")

    # Output:
    # Phone Display: Weather updated - Sunny
    # TV Display: Weather updated - Sunny
