package ss4oop.equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    // constructor 3 tham số
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // delta
    public double getDiscriminant() {
        return (Math.pow(b, 2) - 4 * a * c);
    }
    // getRoot1
    public double getRoot1() {
        return (-b + Math.sqrt(this.getDiscriminant())) / (2 * a);
    }
    // getRoot2
    public double getRoot2() {
        return (-b - Math.sqrt(this.getDiscriminant())) / (2 * a);
    }
    // getA
    public double getA() {
        return a;
    }
    // getB
    public double getB() {
        return b;
    }
    // getC
    public double getC() {
        return c;
    }
}
