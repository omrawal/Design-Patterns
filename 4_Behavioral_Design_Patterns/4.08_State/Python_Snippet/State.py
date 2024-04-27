from abc import ABC, abstractmethod

class TrafficLightState(ABC):
    @abstractmethod
    def show_light(self):
        pass

    @abstractmethod
    def next_state(self):
        pass

class RedLight(TrafficLightState):
    def show_light(self):
        print("Showing Red Light")

    def next_state(self):
        return YellowLight()

class YellowLight(TrafficLightState):
    def show_light(self):
        print("Showing Yellow Light")

    def next_state(self):
        return GreenLight()

class GreenLight(TrafficLightState):
    def show_light(self):
        print("Showing Green Light")

    def next_state(self):
        return RedLight()

class TrafficLight:
    def __init__(self):
        self.state = RedLight()  # Start with red light

    def change_state(self):
        self.state = self.state.next_state()

    def show_light(self):
        self.state.show_light()

def main():
    light = TrafficLight()

    light.show_light()  # Output: Showing Red Light

    for _ in range(3):
        light.change_state()
        light.show_light()

if __name__ == "__main__":
    main()
