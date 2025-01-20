public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Create Book objects
        Book defaultBook = new Book();               // Using default constructor
        Book customBook = new Book("1984", "George Orwell", 9.99); // Using parameterized constructor

        // Display book details
        defaultBook.displayBookDetails();
        customBook.displayBookDetails();
    }
}
