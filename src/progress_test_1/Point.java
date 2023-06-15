package progress_test_1;

public class Point {

    private double x;
    private double y;

    // Constructors
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Methods
    public double distance(Point other) {
        double dx = this.x - other.getX();
        double dy = this.y - other.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void display() {
        System.out.println("A(" + this.x + ", " + this.y + ")");
    }

    // Getters and Setters
    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}