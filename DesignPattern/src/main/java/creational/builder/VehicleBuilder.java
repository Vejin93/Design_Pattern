package creational.builder;

public abstract class VehicleBuilder {
    protected Vehicle vehicle;

    public Vehicle createVehicle() {
        vehicle = new Vehicle();
        setManufacturerForVehicle();
        setColorForVehicle();
        setGenerationForVehicle();
        return vehicle;
    }

    public abstract void setManufacturerForVehicle();

    public abstract void setColorForVehicle();

    public abstract void setGenerationForVehicle();
}
