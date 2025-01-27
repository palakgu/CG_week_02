package hybrid_inheritance;

class Vehicle{
    private float maxSpeed;
    private String model;
    // Constructor to initialize vehicle properties
    public Vehicle(float maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
        }
        // Method to display vehicle information
        public void displayInfo(){
            System.out.println("Model: " + model);
            System.out.println("Max Speed: " + maxSpeed);

        }

}