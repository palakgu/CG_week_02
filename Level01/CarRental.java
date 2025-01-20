public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; // Daily rental rate

    // Default constructor
    public CarRental() {
        this.customerName = "";
        this.carModel = "";
        this.rentalDays = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Create CarRental objects
        CarRental defaultRental = new CarRental();                                 // Using default constructor
        CarRental customRental = new CarRental("John Doe", "Toyota Camry", 5);      // Using parameterized constructor
        CarRental copiedRental = new CarRental(customRental);                      // Using copy constructor

        // Display rental details
        defaultRental.displayRentalDetails();
        customRental.displayRentalDetails();
        copiedRental.displayRentalDetails();
    }
}
