package Bank;
import java.util.ArrayList;
import java.util.Scanner;

//write a program and make a customer class and create methods credit , debit and add acc .

class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void checkAccount() {
        System.out.println("Account Details for " + name);
        System.out.println("Balance: Rs" + balance);
    }

    public void checkDebit() {
        System.out.println("Debit Amount for " + name + ": Rs" + balance);
    }

    public void checkCredit() {
        System.out.println("Credit Amount for " + name + ": Rs" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Rs" + amount + " into " + name + "'s account.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Rs" + amount + " from " + name + "'s account.");
        } else {
            System.out.println("Insufficient funds for withdrawal from " + name + "'s account.");
        }
    }
}


public class BOH {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Management System");

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();

        Customer customer = new Customer(customerName, initialBalance);

        
        int choice;
        do {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Check Account");
            System.out.println("2. Check Debit Amount");
            System.out.println("3. Check Credit Amount");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    customer.checkAccount();
                    break;
                case 2:
                    customer.checkDebit();
                    break;
                case 3:
                    customer.checkCredit();
                    break;
                case 4:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    customer.deposit(depositAmount);
                    break;
                case 5:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    customer.withdraw(withdrawalAmount);
                    break;
                case 6:
                    System.out.println("Exiting Bank Management System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 6);

        scanner.close();
    }
}
		
