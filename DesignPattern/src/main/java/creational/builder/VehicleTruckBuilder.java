package creational.builder;

public class VehicleTruckBuilder extends VehicleBuilder {
    @Override
    public void setManufacturerForVehicle() {
        vehicle.setManufacturer("Scania");
    }

    @Override
    public void setColorForVehicle() {
        vehicle.setColor("White");
    }

    @Override
    public void setGenerationForVehicle() {
        vehicle.setGeneration("Third");
    }
}
