public class Circle {
    // Attribute
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display the radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        // Create Circle objects
        Circle defaultCircle = new Circle();       // Using default constructor
        Circle customCircle = new Circle(5.0);     // Using parameterized constructor

        // Display radius
        defaultCircle.displayRadius();
        customCircle.displayRadius();
    }
}
