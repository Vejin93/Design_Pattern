package creational.abstractFactory;

public abstract class VehicleFactory {
    public static final int CAR_FACTORY = 0;
    public static final int TRUCK_FACTORY = 1;

    public static VehicleFactory getFactory(int type) {
        switch (type) {
            case VehicleFactory.CAR_FACTORY:
                return new CarFactory();
            case VehicleFactory.TRUCK_FACTORY:
                return new TruckFactory();
            default:
                return null;
        }
    }

    public abstract Vehicle createVehicle();
}
