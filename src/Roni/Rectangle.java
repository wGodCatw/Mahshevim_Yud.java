package Roni;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return width*2 + length*2;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean isSquare(){
        return width==length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

