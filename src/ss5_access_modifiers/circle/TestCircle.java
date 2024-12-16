package ss5_access_modifiers.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.4, "red");
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        System.out.println(circle.getArea());
    }
}
