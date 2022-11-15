package creational.factory;

public class VehicleFactory {
    public static final int CAR = 0;
    public static final int TRUCK = 1;

    public static Vehicle createVehicle(int type) {
        switch (type) {
            case CAR:
                return new Car();
            case TRUCK:
                return new Truck();
            default:
                return null;
        }
    }
}
