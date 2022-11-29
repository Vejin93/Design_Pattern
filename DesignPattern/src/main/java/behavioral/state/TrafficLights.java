package behavioral.state;


public class TrafficLights {

    TrafficLightsState state;

    public TrafficLights() {
        state = blinkYellow.getInstance();
    }

    public void turnOn() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        state = state.turnOn();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            state.printState();
            state = state.timerActivated();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        state = state.turnOff();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
