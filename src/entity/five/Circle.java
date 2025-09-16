package entity.five;

public class Circle extends Shape{
    private double radius;
    public Circle( double radius) {
        this.radius = radius;
    }

    @Override
    public double GetArea() {
        return Math.PI * radius * radius;
    }
}
