// Practice Problems - Week 3
// Author: Noah Whiffen - SD 12

// Circle class
class Circle {
    private double radius;
    private String colour;
    public final static double PI = 3.14;
    
    // Default Constructor
    public Circle() {
        this.radius = 1.0;
        this.colour = "red";
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "Circle[ radius: " + radius + "colour: " + colour + "]";
    }

    public double getArea() {
        double area = PI * Math.pow(radius, 2);
        return area;
    }
}