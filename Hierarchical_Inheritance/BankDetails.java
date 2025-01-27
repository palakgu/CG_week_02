package Hierarchical_Inheritance;
 
 public class BankDetails{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12456, 120000, 12);
        CheckingAccount checkingAccount = new CheckingAccount(12456, 123000, 11200);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(12456, 126000, 10000);
        savingsAccount.DisplayAccountType();
        checkingAccount.DisplayAccountType();
        fixedDepositAccount.DisplayAccountType();
    }
 }