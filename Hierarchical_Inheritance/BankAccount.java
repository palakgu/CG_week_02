package Hierarchical_Inheritance;

class BankAccount{
    private int accountNumber;
    private double balance;
    public BankAccount(int accountNumber , double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    
    }
    public void DisplayAccountType(){
        System.out.println(" the Account number is "+ accountNumber);
        System.out.println(" the balance of the account is "+ balance);
    }

 }