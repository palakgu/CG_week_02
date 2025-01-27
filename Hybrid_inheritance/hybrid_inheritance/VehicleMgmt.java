package hybrid_inheritance;
// Main class to manage vehicles
public class VehicleMgmt {
    // Main method to test vehicle classes
    public static void main(String[] args) {
        // Create an electric vehicle
        ElectricVehicle ev = new ElectricVehicle(120.0f,"Tesla",50);
        ev.displayInfo();
        ev.charge();
        System.out.println("------------------------------");
        // Create a petrol vehicle
        PetrolVehicle pv = new PetrolVehicle(150.0f,"Rolls Roycce",80);
        pv.displayInfo();
        pv.refuel();

        
    }
}