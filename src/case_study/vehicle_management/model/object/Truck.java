package case_study.vehicle_management.model.object;

public class Truck extends Vehicle {
    private double load;

    public Truck() {
    }

    public Truck(String registryNumber, String automaker, int year, String owner, double load) {
        super(registryNumber, automaker, year, owner);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public String getInfoToFile() {
        return super.toString() + "," + this.load;
    }
}
