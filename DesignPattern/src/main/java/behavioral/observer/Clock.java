package behavioral.observer;

public class Clock implements Observer {

    @Override
    public void update (int newState){
        System.out.println(newState);
    }
}
