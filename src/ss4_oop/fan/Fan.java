package ss4_oop.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // constructor
    public Fan() {

    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    // getter và setter của các thuộc tính
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // toString
    public String toString() {
        if (on) {
            return "Quạt này có tốc độ " + speed + ", màu " + color + ", " + "bán kính là " + radius + ", "
                    + "và quạt đang bật!";
        }
        return "Quạt này có màu " + color + ", " + "bán kính là " + radius + ", " + "và quạt đang tắt!";
    }
}
