// Practice - Week 3
// Author: Noah Whiffen - SD 12
//Date: January 30th, 2025

public class TestMyPoint {
    
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(3,4);
        MyPoint p2 = new MyPoint(5,6);

        p1.setX(8); // Test setters
        p1.setY(6);
        p1.setXY(3, 0); // Test setXY()

        System.out.println(p1);
        System.out.println(p1); // Test toString()

        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());

        // Testing the overloaded methods
        System.out.println(p1.distance(5,6));
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance());
        System.out.println(p2.distance(p1));
    }
}
