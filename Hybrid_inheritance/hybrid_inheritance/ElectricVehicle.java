package hybrid_inheritance;

class ElectricVehicle extends Vehicle{
    private int charge;
    // Method to display electric vehicle information
    public void displayInfo(){
        super.displayInfo();
        System.out.println("current charge "+charge);
    }
    // Method to charge the electric vehicle
    public void charge(){
        if(charge!=100){
            System.out.println("charging...");
        }
        else{
            System.out.println("already charged ");
        }
    }
    // Constructor to initialize electric vehicle properties
    ElectricVehicle(float maxSpeed,String model,int charge)
    {
        super(maxSpeed,model);
        this.charge=charge;
    }

}