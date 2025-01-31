// Practice - Week 3
// Author: Noah Whiffen - SD 12
//Date: January 31th, 2025

public class TestMyCircle {

    public static void main(String[] args) {

        MyPoint center1 = new MyPoint(2, 3);
        MyPoint center2 = new MyPoint(5, 7);

        // Create MyCircle objects
        MyCircle circle1 = new MyCircle(); // Default circle
        MyCircle circle2 = new MyCircle(3, 4, 5);
        MyCircle circle3 = new MyCircle(center1, 10);
        MyCircle circle4 = new MyCircle(center2, 8); 

        // Test setters
        circle1.setRadius(7); 
        circle1.setCenterXY(2, 3);
        circle1.setCenterX(4); 
        circle1.setCenterY(5);

        // Test toString()
        System.out.println("---------------------------------");
        System.out.println("To String");
        System.out.println("---------------------------------");
        System.out.println(circle1);
        System.out.println(circle2); 
        System.out.println(circle3);
        System.out.println(circle4);
        System.out.println("---------------------------------");

        // Testing getters
        System.out.println("Getters");
        System.out.println("---------------------------------");
        System.out.println("Area of Circle 2: " + circle2.getArea());
        System.out.println("Circumference of Circle 2: " + circle2.getCircumference());
        System.out.println("Center of Circle 2: " + circle2.getCenter());
        System.out.println("Center X of Circle 2: " + circle2.getCenterX(3)); 
        System.out.println("Center Y of Circle 2: " + circle2.getCenterY(4));
        System.out.println("---------------------------------");

        // Testing the distanceToCenter method
        System.out.println("Distance method");
        System.out.println("---------------------------------");
        System.out.println("Distance between Circle 1 and Circle 3 centers: " + circle1.distanceToCenter(circle3));

        // Checking distance between two circles using their centers
        double distance = circle2.distanceToCenter(circle4);
        System.out.println("Distance between Circle 2 and Circle 4: " + distance);
        System.out.println("---------------------------------");
    }
}