package hybrid_inheritance;

class PetrolVehicle  extends Vehicle implements Refuelable{
    private int fuelLevel;
    // Constructor to initialize petrol vehicle properties
    PetrolVehicle(float maxSpeed,String model,int fuelLevel){
        super(maxSpeed,model);
        this.fuelLevel=fuelLevel;
    }
    // Method to display petrol vehicle information
    public void displayInfo(){
        super.displayInfo();
        System.out.println("fuel level "+fuelLevel);
    }
    // Method to refuel the petrol vehicle
    public void refuel(){
        if(fuelLevel<100){
            System.out.println("refueling the tank");
        }
        else{
            System.out.println("tank is already full");
        }
    }

}
