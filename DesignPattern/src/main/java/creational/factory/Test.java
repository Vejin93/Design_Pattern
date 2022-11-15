package creational.factory;

public class Test {

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle(VehicleFactory.CAR);
        car.drive();

        Vehicle truck = VehicleFactory.createVehicle(VehicleFactory.TRUCK);
        truck.drive();

        if (car instanceof Car) {
            System.out.println("car is an object of class Car");
        }
    }
}
