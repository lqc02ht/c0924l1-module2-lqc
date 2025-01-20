package case_study.vehicle_management.model.object;

public class Car extends Vehicle {
    private int seatAmount;
    private String type;

    public Car() {
    }

    public Car(String registryNumber, String automaker, int year, String owner, int seatAmount, String type) {
        super(registryNumber, automaker, year, owner);
        this.seatAmount = seatAmount;
        this.type = type;
    }

    public int getSeatAmount() {
        return seatAmount;
    }

    public void setSeatAmount(int seatAmount) {
        this.seatAmount = seatAmount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", seatAmount='" + seatAmount + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public String getInforToFile() {
        return super.getInforToFile() + "," + this.seatAmount + "," + this.type;
    }
}
