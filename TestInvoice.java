// Practice - Week 3
// Author: Noah Whiffen - SD 12
// Date: February 1st, 2025

public class TestInvoice {
    
    public static void main(String[] args) {

        // Create customers
        Customer customer1 = new Customer(1, "Bobby Singer", 'M', 50);
        Customer customer2 = new Customer(2, "Sam Winchester", 'M', 20);
        Customer customer3 = new Customer(3, "Dean Winchester", 'M', 20);

        // Create invoices
        Invoice invoice1 = new Invoice(1, customer1, 20.5);
        Invoice invoice2 = new Invoice(2, customer2, 45);
        Invoice invoice3 = new Invoice(3, customer3, 50);

        // Test setters
        invoice1.setAmount(50);
        invoice2.setAmount(40);

        invoice1.setCustomer(customer3);

        System.out.println("-----------------------------");
        System.out.println("Invoices after new values set");
        System.out.println("-----------------------------");
        System.out.println(invoice1.getAmount());
        System.out.println(invoice2.getAmount());
        System.out.println(invoice1.getCustomerName());


        // Test getters
        System.out.println("-----------------------------");
        System.out.println("Getter methods");
        System.out.println("-----------------------------");
        System.out.println(invoice1.getID());
        System.out.println(invoice1.getCustomer());
        System.out.println(invoice2.getAmount());
        System.out.println(invoice2.getCustomerName());
        System.out.println(invoice3.getAmountAfterDiscount());

    }
}
