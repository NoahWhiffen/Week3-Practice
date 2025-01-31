// Practice - Week 3
// Author: Noah Whiffen - SD 12
//Dates: January 30th, 2025 - 

// NOTES TO SELF
// come back and fix triangle validation
// come back and check TestMyCircle file

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

// MyPoint class
class MyPoint {
    private int x;
    private int y;

    // Default Constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        // Distance from this point to the given point at x,y
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance(MyPoint anotherPoint) { // Use this for distance between points in triangle
        int xDiff = this.x - anotherPoint.x;
        int yDiff = this.y - anotherPoint.y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance() {
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }
}

// MyCircle class (Different class than circle above)

class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    // Creates a circle from x, y coordinates and radius
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Creates a circle using an existing MyPoint object for the center, and a radius
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = new MyPoint();
    }

    public int getCenterX(int x) {
        return x;
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY(int y) {
        return y;
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int getCenterXY(MyPoint center) {
        return center.getX(x) + center.getY(y);
    }

    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public String toString() {
        return "My Circle [radius = " + radius + ", " + center + "]"; 
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getCircumference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public double distanceToCenter(MyCircle anotherCircle) {
        return this.center.distance(anotherCircle.center);
    }
}

// MyTriangle class
class MyTriangle{
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "My Triangle: [v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3 + "]";
    }

    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    // Check to make sure sides of triangle aren't collinear 
    public boolean isValidTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        // Calculate the area using the determinant formula
        double area = Math.abs(v1.getX() * (v2.getY() - v3.getY()) + v2.getX() * (v3.getY() - v1.getY()) + v3.getX() * (v1.getY() - v2.getY())) / 2.0;
        
        // If the area is zero, the points are collinear, meaning it's not a valid triangle
        return area != 0;
    }

    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
    
        if (isValidTriangle(v1, v2, v3)) {
            if (side1 == side2 && side2 == side3) {
                return "Equilateral";
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Not a valid triangle";
        }
    }
}

class Customer {
    
}