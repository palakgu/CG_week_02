package Hierarchical_Inheritance;

class CheckingAccount extends BankAccount{
    private double withdrawalLimit ;
    public CheckingAccount(int accountNumber , double balance , double withdrawalLimit){
       super(accountNumber, balance);
       this.withdrawalLimit = withdrawalLimit;
    }
    public void DisplayAccountType(){
       super.DisplayAccountType();
       System.out.println(" the account is Checking account");
       System.out.println(" the Withdrawlimit is "+ withdrawalLimit);
    }
    }