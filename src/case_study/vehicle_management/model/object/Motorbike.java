package case_study.vehicle_management.model.object;

public class Motorbike extends Vehicle {
    private double power;

    public Motorbike() {
    }

    public Motorbike(String registryNumber, String automaker, int year, String owner, double power) {
        super(registryNumber, automaker, year, owner);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String getInfoToFile() {
        return super.toString() + "," + this.power;
    }
}
