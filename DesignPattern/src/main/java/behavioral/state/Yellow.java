package behavioral.state;

public class Yellow extends TrafficLightsState{

    private static Yellow instance = null;

    public static Yellow getInstance(){
        if(instance == null)
            instance = new Yellow();
        return instance;
    }

    private Yellow(){

    }

    @Override
    public TrafficLightsState timerActivated() {
        return Red.getInstance();
    }

    @Override
    public TrafficLightsState turnOn(){
        return this;
    }

    @Override
    public void printState() {
        System.out.println("YELLOW");
    }
}
