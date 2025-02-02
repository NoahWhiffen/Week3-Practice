// Practice - Week 3
// Author: Noah Whiffen - SD 12
//Dates: January 30th, 2025 - February 1st, 2025

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
    private double x;
    private double y;

    // Default Constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(double x, double y) {
        // Distance from this point to the given point at x,y
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance(MyPoint anotherPoint) { // Use this for distance between points in triangle
        double xDiff = this.x - anotherPoint.x;
        double yDiff = this.y - anotherPoint.y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance() {
        double xDiff = this.x - 0;
        double yDiff = this.y - 0;
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
    public MyCircle(double x, double y, int radius) {
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

    public double getCenterX(double x) {
        return center.getX();
    }

    public void setCenterX(double x) {
        center.setX(x);
    }

    public double getCenterY(double y) {
        return center.getY();
    }

    public void setCenterY(double y) {
        center.setY(y);
    }

    public double getCenterXY(MyPoint center) {
        return center.getX() + center.getY();
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

    private static final double EPSILON = 1E-6; // To avoid precision errors

    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
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
        
        return area > EPSILON; // The area is compared to EPSILON to account for floating-point precision errors and ensure the points are not collinear.
    }

    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
    
        if (isValidTriangle(v1, v2, v3)) {
            if (Math.abs(side1 - side2) < EPSILON && Math.abs(side2 - side3) < EPSILON) { 
                return "Equilateral";
            } else if (Math.abs(side1 - side2) < EPSILON || Math.abs(side2 - side3) < EPSILON || Math.abs(side1 - side3) < EPSILON) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Not a valid triangle";
        }
    }
}

// Customer class
class Customer {
    private int ID;
    private String name;
    private char gender;
    private int discount;

    public Customer(int ID, String name, char gender, int discount) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        return name + " (" + ID + ") ";
    }
}

//Invoice class
class Invoice {
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        double discount = customer.getDiscount();
        return amount - (discount / 100);
    }
}

//Account class
class Account {
    private int ID;
    private Customer customer;
    private double balance;

    // Default Constructor
    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
        this.balance = 0.0;
    }

    // Constructor with balance initialization
    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.toString() + "Balance: $" + String.format("%.2f", balance);
    }

    public Account deposit(double amount) {
        balance = balance + amount;
        return this; 
    }
    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return this;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
            return this;
        }
    }
}