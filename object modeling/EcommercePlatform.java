import java.util.ArrayList;
import java.util.List;

class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void printDetails() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }
}

class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            product.printDetails();
        }
    }
}

class Customer {
    private String customerId;
    private String name;
    private List<Order> orders;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showCustomerOrders() {
        System.out.println("Customer Name: " + name);
        for (Order order : orders) {
            order.showOrderDetails();
        }
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1500.0);
        Product product2 = new Product("Smartphone", 800.0);
        Product product3 = new Product("Headphones", 150.0);

        // Create an order and add products
        Order order1 = new Order("O001");
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order("O002");
        order2.addProduct(product3);

        // Create a customer and place orders
        Customer customer = new Customer("C001", "John Doe");
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Show customer orders
        customer.showCustomerOrders();
    }
}
