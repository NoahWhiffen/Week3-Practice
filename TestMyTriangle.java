public class TestMyTriangle {
    
    public static void main(String[] args) {

        // Triangle 1
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(8, 0);
        MyPoint p3 = new MyPoint(0, 8);

        // Triangle 2
        MyPoint p4 = new MyPoint(0, 0);
        MyPoint p5 = new MyPoint(4, 0);
        MyPoint p6 = new MyPoint(2, 3);

        //Triangle 3
        MyPoint p7 = new MyPoint(9, 4);
        MyPoint p8 = new MyPoint(6, 3);
        MyPoint p9 = new MyPoint(7, 2);

        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        MyTriangle t2 = new MyTriangle(p4, p5, p6);
        MyTriangle t3 = new MyTriangle(p7, p8, p9);

        // toString method
        System.out.println("-----------------------------");
        System.out.println("String Method");
        System.out.println("-----------------------------");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        

        // getPerimeter method
        System.out.println("-----------------------------");
        System.out.println("Perimeter Method");
        System.out.println("-----------------------------");
        System.out.println("Triangle 1: " + t1.getPerimeter());
        System.out.println("Triangle 2: " + t2.getPerimeter());
        System.out.println("Triangle 3: " + t3.getPerimeter());

        //getType method
        System.out.println("-----------------------------");
        System.out.println("Type Method");
        System.out.println("-----------------------------");
        System.out.println("Triangle 1: " + t1.getType());
        System.out.println("Triangle 2: " + t2.getType());
        System.out.println("Triangle 3: " + t3.getType());
        System.out.println("-----------------------------");

    }
}
