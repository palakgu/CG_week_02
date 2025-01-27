package Hierarchical_Inheritance;

class  SavingsAccount extends BankAccount{
    private int interstrate ;
     public SavingsAccount(int accountNumber , double balance , int interstrate){
    super(accountNumber, balance);
    this.interstrate = interstrate;
     }
     public void DisplayAccountType(){
       super.DisplayAccountType();
       System.out.println(" the account Type is Saving ");
       System.out.println("with the intrest rate of "+ interstrate);
     }
    }