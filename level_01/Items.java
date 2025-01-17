
import java.util.*;
public class Items{
int itemCode ;
String itemName;
double itemPrice;

public Items(int itemCode , String itemName ,double itemPrice){
this.itemCode = itemCode;
this.itemName = itemName;
this.itemPrice = itemPrice;

}
public static void Display(int itemCode , String itemName , double itemPrice){
System.out.println("The code of the item is "+ itemCode);
System.out.println("The Name of the item is "+ itemName);
System.out.println("The Price of the item is "+ itemPrice);
}
public static void totalcost(double itemPrice , int quantity){
double total = quantity*itemPrice;
System.out.println("The total cost for the given Quantity is "+ total);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the quantity of the item");
int quantity = sc.nextInt();
Items obj = new Items( 18, "Bags" , 1500);
Display(18, "Bags" , 1500);
totalcost(1500 , quantity);
}

}