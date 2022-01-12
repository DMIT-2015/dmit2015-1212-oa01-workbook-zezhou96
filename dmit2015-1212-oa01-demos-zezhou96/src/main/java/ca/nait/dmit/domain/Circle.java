package ca.nait.dmit.domain;

public class Circle {
    private double radius;

    // GET
    public double getRadius() {
        return radius;
    }

    /*
    public void setRadius(double radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("Radius must be greater than 0");
        }
        this.radius = radius;
    }
     */

    // SET
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Radius must be greater than 0");    // Not critical
        }
        this.radius = radius;
    }

    // Constructor
    public Circle() {
        radius = 1;
    }
    // Constructor with field
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method
    public double area() {
        return Math.PI * radius * radius;
    }
}
