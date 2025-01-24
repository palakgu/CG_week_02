import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    public void printDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}

class Customer {
    private String accountHolder;
    private List<Account> accounts;

    public Customer(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accounts = new ArrayList<>();
    }

    public String getAccountholder() {
        return accountHolder;
    }

    public void openAccount(String accountNumber, double initialBalance) {
        Account newAccount = new Account(accountNumber, initialBalance);
        accounts.add(newAccount);
    }

    public void viewBalance() {
        System.out.println("\nAccounts for " + accountHolder + ": ");
        for (Account account : accounts) {
            account.printDetails();
        }
    }
}

class Bank {
    private static String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void openAccount(Customer customer, String accountNumber, double initialBalance) {
        customer.openAccount(accountNumber, initialBalance);
    }

    public void showCustomerAccounts(Customer customer) {
        customer.viewBalance();
    }
}

public class BankAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        bank.openAccount(customer1, "123456", 1000.0);
        bank.openAccount(customer1, "654321", 500.0);
        bank.openAccount(customer2, "789012", 1500.0);

        System.out.println("\n=== Accounts in Global Bank ===");
        bank.showCustomerAccounts(customer1);
        bank.showCustomerAccounts(customer2);
    }
}
