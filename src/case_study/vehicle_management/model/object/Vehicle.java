package case_study.vehicle_management.model.object;

public abstract class Vehicle {
    private String registryNumber;
    private String automaker;
    private int year;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String registryNumber, String automaker, int year, String owner) {
        this.registryNumber = registryNumber;
        this.automaker = automaker;
        this.year = year;
        this.owner = owner;
    }

    public String getAutomaker() {
        return automaker;
    }

    public void setAutomaker(String automaker) {
        this.automaker = automaker;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(String registryNumber) {
        this.registryNumber = registryNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{registryNumber='" + registryNumber + '\'' +
                ", automaker='" + automaker + '\'' +
                ", year=" + year +
                ", owner='" + owner + '\'';
    }

    public String getInforToFile() {
        return this.registryNumber + "," + this.automaker + "," + this.year + "," + this.owner;
    }
}
