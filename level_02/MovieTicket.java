// Define the MovieTicket class
public class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " at seat " + seatNumber + " for $" + price);
        } else {
            System.out.println("Ticket is already booked.");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a new MovieTicket object
        MovieTicket ticket = new MovieTicket("Avengers", "A1", 15.99);

        // Display initial ticket details
        ticket.displayTicketDetails();

        // Book the ticket
        ticket.bookTicket();

        // Display updated ticket details
        ticket.displayTicketDetails();
    }
}