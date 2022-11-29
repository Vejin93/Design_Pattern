package behavioral.state;

public class Green extends TrafficLightsState{

    private static Green instance = null;

    public static Green getInstance(){
        if(instance == null)
            instance = new Green();
        return instance;
    }

    private Green(){

    }

    @Override
    public TrafficLightsState timerActivated(){
        return blinkGreen.getInstance();
    }

    @Override
    public TrafficLightsState turnOn(){
        return this;
    }

    @Override
    public void printState(){
        System.out.println("GREEN");
    }
}
