// Practice - Week 3
// Author: Noah Whiffen - SD 12
// Date: February 1st, 2025

public class TestCustomer {
    public static void main(String[] args) {

        // Create customers
        Customer customer1 = new Customer(1, "Bobby Singer", 'M', 50);
        Customer customer2 = new Customer(2, "Sam Winchester", 'M', 20);
        Customer customer3 = new Customer(3, "Dean Winchester", 'M', 20);

        // Test getters
        System.out.println(customer1.getID());
        System.out.println(customer1.getName());
        System.out.println(customer1.getGender());
        System.out.println(customer1.getDiscount());

        // Test setters
        customer3.setDiscount(40);
        customer2.setDiscount(40);

        System.out.println(customer3.getDiscount());
        System.out.println(customer2.getDiscount());

        // Test string method
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());
    }
}