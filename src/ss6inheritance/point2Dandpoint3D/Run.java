package ss6inheritance.point2Dandpoint3D;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        // Point2D
        Point2D point2D1 = new Point2D();
        Point2D point2D2 = new Point2D(1.22F, 3.43F);
        point2D1.setXY(4.59F, 9.73F);
        System.out.println(point2D1);
        System.out.println(point2D2);

        float[] point2DArray1 = point2D1.getXY();
        float[] point2DArray2 = point2D2.getXY();
        System.out.println(Arrays.toString(point2DArray1));
        System.out.println(Arrays.toString(point2DArray2));

        // Point3D
        Point3D point3D1 = new Point3D();
        Point3D point3D2 = new Point3D(1.22F, 3.43F, 6.37F);
        point3D1.setXYZ(12.84F, 10.56F, 6.23F);
        System.out.println(point3D1);
        System.out.println(point3D2);

        float[] point3DArray1 = point3D1.getXYZ();
        float[] point3DArray2 = point3D2.getXYZ();
        System.out.println(Arrays.toString(point3DArray1));
        System.out.println(Arrays.toString(point3DArray2));
    }
}
