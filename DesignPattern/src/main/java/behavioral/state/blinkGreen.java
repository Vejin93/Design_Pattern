package behavioral.state;

public class blinkGreen extends TrafficLightsState{

    private static blinkGreen instance = null;

    public static blinkGreen getInstance(){
        if(instance == null)
            instance = new blinkGreen();
        return instance;
    }

    private blinkGreen(){

    }

    @Override
    public TrafficLightsState timerActivated(){
        return Yellow.getInstance();
    }

    @Override
    public TrafficLightsState turnOn() {
        return this;
    }

    @Override
    public void printState(){
        System.out.println("BLINK GREEN");
    }
}
