package ss6_inheritance.circle_and_cylinder;

public class Run {
    public static void main(String[] args) {
        // Circle
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(14.5, "yellow");
        circle1.setRadius(25.6);
        circle1.setColor("red");
        System.out.println(circle1);
        System.out.println(circle2);

        // Cylinder
        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(14.5, "yellow", 3.4);
        cylinder1.setRadius(25.6);
        cylinder1.setColor("red");
        cylinder1.setHeight(45.79);
        System.out.println(cylinder1);
        System.out.println(cylinder2);
    }
}
