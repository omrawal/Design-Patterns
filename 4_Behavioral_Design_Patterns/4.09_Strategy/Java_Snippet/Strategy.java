// Strategy Interface
interface RoutingStrategy {
    void calculateRoute(String origin, String destination);
}

// Concrete Strategy: ShortestDistanceRouting
class ShortestDistanceRouting implements RoutingStrategy {
    @Override
    public void calculateRoute(String origin, String destination) {
        // Logic to calculate the shortest distance route
        System.out.println("Calculating shortest distance route from " + origin + " to " + destination);
    }
}

// Concrete Strategy: FastestRouteRouting
class FastestRouteRouting implements RoutingStrategy {
    @Override
    public void calculateRoute(String origin, String destination) {
        // Logic to calculate the fastest route
        System.out.println("Calculating fastest route from " + origin + " to " + destination);
    }
}

// Concrete Strategy: AvoidTollRoadsRouting
class AvoidTollRoadsRouting implements RoutingStrategy {
    @Override
    public void calculateRoute(String origin, String destination) {
        // Logic to calculate a route avoiding toll roads
        System.out.println("Calculating route from " + origin + " to " + destination + " while avoiding toll roads");
    }
}

// Context: NavigationApp
class NavigationApp {
    private RoutingStrategy routingStrategy;

    public NavigationApp(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
    }

    public void setRoutingStrategy(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy;
    }

    public void calculateRoute(String origin, String destination) {
        this.routingStrategy.calculateRoute(origin, destination);
    }
}

// Usage
public class Strategy {
    public static void main(String[] args) {
        String origin = "A";
        String destination = "B";

        NavigationApp navigationApp = new NavigationApp(new ShortestDistanceRouting());
        navigationApp.calculateRoute(origin, destination);
        // Output: Calculating shortest distance route from A to B

        navigationApp.setRoutingStrategy(new FastestRouteRouting());
        navigationApp.calculateRoute(origin, destination);
        // Output: Calculating fastest route from A to B

        navigationApp.setRoutingStrategy(new AvoidTollRoadsRouting());
        navigationApp.calculateRoute(origin, destination);
        // Output: Calculating route from A to B while avoiding toll roads
    }
}
