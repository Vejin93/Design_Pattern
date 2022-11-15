package creational.builder;

public class VehicleCarBuilder extends VehicleBuilder {

    @Override
    public void setManufacturerForVehicle() {
        vehicle.setManufacturer("Peugeot");
    }

    @Override
    public void setColorForVehicle() {
        vehicle.setColor("Gray");
    }

    @Override
    public void setGenerationForVehicle() {
        vehicle.setGeneration("First");
    }
}
