from abc import ABC,abstractmethod

# Strategy Interface
class RoutingStrategy(ABC):
    @abstractmethod
    def calculate_route(self, origin, destination):
        pass

# Concrete Strategy: ShortestDistanceRouting
class ShortestDistanceRouting(RoutingStrategy):
    def calculate_route(self, origin, destination):
        # Logic to calculate the shortest distance route
        print(f"Calculating shortest distance route from {origin} to {destination}")

# Concrete Strategy: FastestRouteRouting
class FastestRouteRouting(RoutingStrategy):
    def calculate_route(self, origin, destination):
        # Logic to calculate the fastest route
        print(f"Calculating fastest route from {origin} to {destination}")

# Concrete Strategy: AvoidTollRoadsRouting
class AvoidTollRoadsRouting(RoutingStrategy):
    def calculate_route(self, origin, destination):
        # Logic to calculate a route avoiding toll roads
        print(f"Calculating route from {origin} to {destination} while avoiding toll roads")

# Context: NavigationApp
class NavigationApp:
    def __init__(self, routing_strategy):
        self.routing_strategy = routing_strategy

    def set_routing_strategy(self, routing_strategy):
        self.routing_strategy = routing_strategy

    def calculate_route(self, origin, destination):
        self.routing_strategy.calculate_route(origin, destination)

# Usage
if __name__ == "__main__":
    origin = "A"
    destination = "B"

    navigation_app = NavigationApp(ShortestDistanceRouting())
    navigation_app.calculate_route(origin, destination)
    # Output: Calculating shortest distance route from A to B

    navigation_app.set_routing_strategy(FastestRouteRouting())
    navigation_app.calculate_route(origin, destination)
    # Output: Calculating fastest route from A to B

    navigation_app.set_routing_strategy(AvoidTollRoadsRouting())
    navigation_app.calculate_route(origin, destination)
    # Output: Calculating route from A to B while avoiding toll roads
