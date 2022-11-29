package behavioral.state;

public class Red extends TrafficLightsState {

    private static Red instance = null;

    public static Red getInstance(){
        if(instance == null)
            instance = new Red();
        return instance;
    }

    private Red(){

    }

    @Override
    public TrafficLightsState timerActivated() {
        return redYellow.getInstance();
    }

    @Override
    public TrafficLightsState turnOn() {
        return this;
    }

    @Override
    public void printState() {
        System.out.println("RED");
    }
}
