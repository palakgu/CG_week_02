public class BookBorrow {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Default constructor
    public BookBorrow() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
        this.availability = true;
    }

    // Parameterized constructor
    public BookBorrow(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
            return true;
        } else {
            System.out.println("The book \"" + title + "\" is not available.");
            return false;
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        // Create Book objects
        BookBorrow book1 = new BookBorrow("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);
        BookBorrow book2 = new BookBorrow("1984", "George Orwell", 9.99, true);

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();

        // Borrow books
        book1.borrowBook();
        book2.borrowBook();

        // Try to borrow the same book again
        book1.borrowBook();

        // Display book details again
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
