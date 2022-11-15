package creational.abstractFactory;

public class Test {

    public static void main(String[] args) {
        VehicleFactory carFactory = VehicleFactory.getFactory(VehicleFactory.CAR_FACTORY);

        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory truckFactory = VehicleFactory.getFactory(VehicleFactory.TRUCK_FACTORY);

        Vehicle truck = truckFactory.createVehicle();
        truck.drive();
    }
}
