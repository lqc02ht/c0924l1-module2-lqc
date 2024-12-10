package ss6inheritance.point;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        // Point
        Point point1 = new Point();
        Point point2 = new Point(3.4F, 6.5F);
        point1.setXY(3.15F, 8.73F);
        System.out.println(point1);
        System.out.println(point2);

        float[] point1Array = point1.getXY();
        float[] point2Array = point2.getXY();
        System.out.println(Arrays.toString(point1Array));
        System.out.println(Arrays.toString(point2Array));

        // MovablePoint
        MovablePoint movablePoint1 = new MovablePoint(6.7F, 9.8F, 5.4F, 2.3F);
        MovablePoint movablePoint2 = new MovablePoint(3.4F, 6.5F);
        movablePoint2.setXY(3.15F, 8.73F);
        System.out.println(movablePoint1);
        System.out.println("After move");

        MovablePoint afterMove = movablePoint1.move();
        System.out.println(afterMove);
        System.out.println(movablePoint2);

        float[] movablePoint1Array = movablePoint1.getSpeed();
        float[] movablePoint2Array = movablePoint2.getSpeed();
        System.out.println(Arrays.toString(movablePoint1Array));
        System.out.println(Arrays.toString(movablePoint2Array));
    }
}
