
public class Mobilephones{
String brand ;
String model;
double price;
public Mobilephones(String brand , String model , double price ){
this.brand = brand;
this.model = model ;
this.price = price;
}
public static void Display(String brand , String model , double price){
System.out.println(" The brand of the mobile phone is "+ brand);
System.out.println(" The model of the mobile phone is "+ model);
System.out.println(" The price of the mobile phone is "+ price);
}
public static void main(String[] args){
Mobilephones obj = new Mobilephones("Realme", "11 pro max", 25000);
Display("Realme", "11 pro max", 25000);
}
}