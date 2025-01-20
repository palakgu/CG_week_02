public class Product {
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable
    private static int totalProducts = 0;

    // Default constructor
    public Product() {
        this.productName = "";
        this.price = 0.0;
        totalProducts++;
    }

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance Method: Display Product Details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method: Display Total Products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        // Create Product objects
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.99);

        // Display product details
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Display total products
        Product.displayTotalProducts();
    }
}
