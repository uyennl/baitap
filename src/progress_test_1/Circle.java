package progress_test_1;

public class Circle implements Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isOuterContact(Circle other) {
        double distance = this.center.distance(other.center);
        return distance == this.radius + other.radius;
    }

    @Override
    public String
    toString() {
        return "Circle{" +
                "center=" + this.center.toString() +
                ", radius=" + radius +
                '}';
    }
}
