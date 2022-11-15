package creational.builder;

public class Test {

    public static void main(String[] args){
        VehicleBuilder vehicleCarBuilder = new VehicleCarBuilder();
        Vehicle vehicle = vehicleCarBuilder.createVehicle();
        System.out.println(vehicle);

        VehicleBuilder vehicleTruckBuilder = new VehicleTruckBuilder();
        vehicle = vehicleTruckBuilder.createVehicle();
        System.out.println(vehicle);
    }
}
