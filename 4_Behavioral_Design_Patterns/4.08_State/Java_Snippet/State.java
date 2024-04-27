interface TrafficLightState {
    void showLight();

    TrafficLightState nextState();
}

class RedLight implements TrafficLightState {
    @Override
    public void showLight() {
        System.out.println("Showing Red Light");
    }

    @Override
    public TrafficLightState nextState() {
        return new YellowLight();
    }
}

class YellowLight implements TrafficLightState {
    @Override
    public void showLight() {
        System.out.println("Showing Yellow Light");
    }

    @Override
    public TrafficLightState nextState() {
        return new GreenLight();
    }
}

class GreenLight implements TrafficLightState {
    @Override
    public void showLight() {
        System.out.println("Showing Green Light");
    }

    @Override
    public TrafficLightState nextState() {
        return new RedLight();
    }
}

class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedLight(); // Start with red light
    }

    public void changeState() {
        this.state = state.nextState();
    }

    public void showLight() {
        state.showLight();
    }
}

public class State {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        light.showLight(); // Output: Showing Red Light

        for (int i = 0; i < 3; i++) {
            light.changeState();
            light.showLight();
        }
    }
}
