package entity.five;

class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double GetArea() {
        return width * height;
    }
}