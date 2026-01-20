public class Shape {

    private String color = "red";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        String fillStatus = "";
        if (this.filled == true) {
            fillStatus = "filled";
        } else {
            fillStatus = "Not filled";
        }
        return "A shape with color of " + color + " and " + fillStatus;
    }
}
