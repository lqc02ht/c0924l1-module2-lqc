package ss7_abstract_and_interface;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (width + this.height);
    }

    @Override
    public void Resize(double percent) {
        this.width = this.width + this.width * (percent / 100);
        this.height = this.height + this.height * (percent / 100);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + " and length = "
                + getHeight() + ", area = " + getArea()
                + ", perimeter = " + getPerimeter() + ". " + super.toString();
    }
}
