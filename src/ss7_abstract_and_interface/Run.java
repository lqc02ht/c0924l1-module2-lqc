package ss7_abstract_and_interface;

import java.util.Random;

public class Run {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(4, 5);
        shapes[1] = new Square(4);
        shapes[2] = new Circle(3);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("------------------------------------------After resizing------------------------------------------");
        for (Shape shape : shapes) {
            shape.Resize(random.nextDouble(1, 100));
            System.out.println(shape);
        }
        System.out.println("How to color square?");
        shapes[1].howToColor();
    }
}
