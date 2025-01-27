package Multilevel_Inheritance;
class Order{
    private String orderid ;
 private String orderdate;
 public Order(String orderid , String orderdate){
    this.orderid = orderid;
    this.orderdate = orderdate;
 }
 public void status(){
    System.out.println(" the order Id of the product is "+ orderid + " an the order date is " + orderdate);
 }
}
class  ShippedOrder extends Order{
    private int trakingNumber  ;
     public ShippedOrder(String orderid , String orderdate ,int trakingNumber){
        super(orderid, orderdate);
        this.trakingNumber= trakingNumber;
     }
     public void status(){
        super.status();
        System.out.println(" the traking number of the order is " + trakingNumber);
     }
}
class DeliveredOrder extends ShippedOrder{
    private String deliverydate ;
    public DeliveredOrder(String orderid , String orderdate , int trakingNumber , String deliverydate){
        super(orderid, orderdate, trakingNumber);
        this.deliverydate= deliverydate;
    }
    public void  status(){
        super.status();
        System.out.println(" the Delevery date of the order is "+ deliverydate);
    }
}
public class Orderdetails{
    public static void main(String[] args) {
        DeliveredOrder deliveredOrder = new DeliveredOrder("9876", "25-01-2025", 45673, "06-02-2025");
        deliveredOrder.status();
    }
}