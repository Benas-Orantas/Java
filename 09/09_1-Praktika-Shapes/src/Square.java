public class Square extends Rectangle{
    public Square() {

    }

    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public Square(double side, String color, boolean filled) {
        super.setLength(side);
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString() {
        return "A Square, which is a subclass of " + super.toString();
    }
}
