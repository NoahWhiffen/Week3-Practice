// Practice - Week 3
// Author: Noah Whiffen - SD 12
// Date: February 1st, 2025

public class TestAccount {
    
    public static void main(String[] args) {

        // Create customers
        Customer customer1 = new Customer(1, "Bobby Singer", 'M', 50);
        Customer customer2 = new Customer(2, "Sam Winchester", 'M', 20);
        Customer customer3 = new Customer(3, "Dean Winchester", 'M', 20);

        // Create accounts
        Account account1 = new Account(1, customer1);
        Account account2 = new Account(1, customer2);
        Account account3 = new Account(1, customer3);

        // Test getters
        System.out.println(account1.getID());
        System.out.println(account2.getCustomer());
        System.out.println(account2.getBalance());

        // Test setters
        account3.setBalance(2000);
        System.out.println(account3.getBalance());

        // Test deposit and withdrawal
        account1.deposit(1000);
        account2.deposit(1500);

        account3.withdraw(1000);

        // Test string method
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
    }
}
