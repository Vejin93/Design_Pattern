package behavioral.state;

public class blinkYellow extends TrafficLightsState{

    private static blinkYellow instance = null;

    public static blinkYellow getInstance(){
        if(instance == null)
            instance = new blinkYellow();
        return instance;
    }

    private blinkYellow(){

    }

    @Override
    public TrafficLightsState timerActivated(){
        return Green.getInstance();
    }
    @Override
    public TrafficLightsState turnOn(){
        return this;
    }
    @Override
    public void printState(){
        System.out.println("BLINK YELLOW");
    }
}
