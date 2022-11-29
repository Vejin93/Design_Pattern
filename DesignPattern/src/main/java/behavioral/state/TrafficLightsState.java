package behavioral.state;

public abstract class TrafficLightsState {

    public abstract TrafficLightsState timerActivated();
    public abstract TrafficLightsState turnOn();
    public TrafficLightsState turnOff(){
        return blinkYellow.getInstance();
    }
    public abstract void printState();
}
