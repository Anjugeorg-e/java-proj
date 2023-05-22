package circle;

public class Circle {
    private double radius;
    public String Color;

    public Circle(double radius) {
        this.radius = radius;
        Color = "red";
    }

    public Circle() {
        radius = 1.0;
        Color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}
