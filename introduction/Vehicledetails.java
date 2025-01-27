 class Vehicle {
   private  int maxSpeed ;
    private String fuelType ;

    public Vehicle(int maxSpeed , String fuelType){
        this.maxSpeed= maxSpeed;
        this.fuelType=fuelType;
    }
    public void displayDetails(){
        System.out.println("the Max Speed of the vehicle is "+ maxSpeed + " the fuel type is "+ fuelType);
    }
}
class Car extends Vehicle{
     private int seatCapacity ;
    public Car (int maxSpeed , String fuelType , int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("The Seat capacity of Car  is "+ seatCapacity);
    }
}
class Truck extends Vehicle{
    private int seatCapacity;
    public Truck(int maxSpeed , String fuelType , int seatCapacity){
        super(maxSpeed , fuelType);
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" the seat capacity of truck is "+ seatCapacity);
    }
}
class Motorcycle extends Vehicle{
    int seatCapacity;

    public Motorcycle (int maxSpeed , String fuelType , int seatCapacity){
        super(maxSpeed , fuelType );
        this.seatCapacity = seatCapacity ;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("the seat capacity of Motorcycle is "+ seatCapacity);
    }
}
public class Vehicledetails{
    public static void main(String[] args){
    Car car = new Car(140, "Petrol", 07);
    Truck truck = new Truck(160, "Desiel", 03);
    Motorcycle motorcycle = new Motorcycle(120, "Petrol", 02);
    car.displayDetails();
    truck.displayDetails();
    motorcycle.displayDetails();
    }
}
