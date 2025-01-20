

public class Vehicle{
private String ownerName ;
private String vehicleType ;
 public static Double registrationFee = 1000.0; 

Vehicle(String name , String type ){
this.ownerName = name ;
this.vehicleType = type ;

}
public void displayVehicleDetails(){
System.out.println(" The name of the Owner is  "+ ownerName );
System.out.println(" The Type of the Vehicle is  "+ vehicleType);
System.out.println(" The Registration fee is " + registrationFee );
}
public static void updateRegistrationFee(double fee){
registrationFee = fee;

}


public static void main(String[] args){
Vehicle Vehicle1 = new Vehicle("Raman" , "two wheeler");
Vehicle Vehicle2 = new Vehicle("Samarth" , "Four wheeler");
System.out.println(" Details of the vehicle without updation ");
Vehicle1.displayVehicleDetails();
System.out.println();
Vehicle2.displayVehicleDetails();
System.out.println();
Vehicle.updateRegistrationFee(2000);
System.out.println(" Values after Updating Registration fees");
Vehicle1.displayVehicleDetails();
System.out.println();
Vehicle2.displayVehicleDetails();
System.out.println();


}
}