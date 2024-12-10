package ss4oop.fan;

public class Run {
    public static void main(String[] args) {
        // fan1
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        // fan2
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        // in ra thông tin của 2 quạt
        System.out.println("Thông tin quạt số 1: " + fan1.toString());
        System.out.println("Thông tin quạt số 2: " + fan2.toString());
    }
}
