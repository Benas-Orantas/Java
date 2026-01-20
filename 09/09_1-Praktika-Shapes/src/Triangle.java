public class Triangle extends Shape {

    private double bottom = 1;
    private double side1 = 1;
    private double side2 = 1;

    public Triangle() {

    }

    public Triangle(double bottom) {
        this.bottom = bottom;
    }

    public Triangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Triangle(double bottom, double side1, double side2, String color, boolean filled) {
        this.bottom = bottom;
        this.side1 = side1;
        this.side2 = side2;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getPerimeter() {
        return bottom + side1 + side2;
    }

    public String toString() {
        return "A triangle with 'first side length'=" + side1 + ", 'second side length'=" + side2 + " and 'bottom width'=" + bottom + ", which is a subclass of " + super.toString();
    }
}
