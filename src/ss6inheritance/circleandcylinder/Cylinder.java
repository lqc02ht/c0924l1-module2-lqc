package ss6inheritance.circleandcylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * (this.height + getRadius());
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", height: " + this.height + ", volume: " + getVolume();
    }
}
