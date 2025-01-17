import java.util.*;

public class BankAccount{
String accountholder ;
int accountNumber;
double balance;
public BankAccount(String accountholder , int accountNumber , double balance){
this.accountholder = accountholder;
this.accountNumber = accountNumber;
this.balance = balance;
}

public static void Withdraw(double balance , double amount1){
if(amount1 >0 && amount1<balance){
balance-=amount1 ; 
System.out.println(" The remaining balance is "+ balance);
} else 
if(amount1>balance){
System.out.println("Insufficient balance ");
} else 
{
System.out.println(" Invalid amount");}
Display(balance);
}

public static void depositing(double balance , double amount2){
if(amount2>0){
balance+= amount2;
System.out.println(" The balance after depositing money is "+ balance);
}
else {
System.out.println(" Invalid depositing ammount");
}
Display(balance);
}
public static void Display(double balance){
System.out.println(" the balance after depositing and withdrawing amount is "+ balance );
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the withdrawing amount ");
double Wammount = sc.nextDouble();
System.out.println("Enter the Depositing ammount");
double Damount = sc.nextDouble(); 
BankAccount obj = new BankAccount( " Naman " , 1234 , 50000 );
Withdraw(50000 , Wammount);
depositing(50000 , Damount);

}
}