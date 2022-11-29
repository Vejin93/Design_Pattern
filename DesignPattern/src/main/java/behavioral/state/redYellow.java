package behavioral.state;

public class redYellow extends TrafficLightsState{

    private static redYellow instance = null;

    public static redYellow getInstance(){
        if(instance == null)
            instance = new redYellow();
        return instance;
    }

    private redYellow(){

    }

    @Override
    public TrafficLightsState timerActivated() {
        return Green.getInstance();
    }

    @Override
    public TrafficLightsState turnOn() {
        return this;
    }

    @Override
    public void printState() {
        System.out.println("RED - YELLOW");
    }
}
