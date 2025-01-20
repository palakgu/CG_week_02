public class HotelBooking {
    // Attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "";
        this.roomType = "";
        this.nights = 0;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Create HotelBooking objects
        HotelBooking defaultBooking = new HotelBooking();                       // Using default constructor
        HotelBooking customBooking = new HotelBooking("Alice", "Suite", 3);     // Using parameterized constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);           // Using copy constructor

        // Display booking details
        defaultBooking.displayBookingDetails();
        customBooking.displayBookingDetails();
        copiedBooking.displayBookingDetails();
    }
}
