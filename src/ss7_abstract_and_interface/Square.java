package ss7_abstract_and_interface;

public class Square extends Shape implements Resizeable, Colorable {
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return Math.pow(edge, 2);
    }

    public double getPerimeter() {
        return 4 * edge;
    }

    @Override
    public void Resize(double percent) {
        this.edge += this.edge * (percent / 100);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "A Square with edge = "
                + getEdge() + ", area = " + getArea()
                + ", perimeter = " + getPerimeter() + ". " + super.toString();
    }
}