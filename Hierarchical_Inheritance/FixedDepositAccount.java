package Hierarchical_Inheritance;

class FixedDepositAccount extends BankAccount{
    private double minlimit;
    public FixedDepositAccount(int accountNumber , double balance , double minlimit){
        super(accountNumber, balance);
        this.minlimit = minlimit;
    }
    public void DisplayAccountType(){
        super.DisplayAccountType();
        System.out.println(" The account type is fixed account ");
        System.out.println(" The minimum limit of the account is "+ minlimit);
    }
 }