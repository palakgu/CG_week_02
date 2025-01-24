import java.util.ArrayList;
import java.util.List;

class Product{
    private String productName;
    private double price;
    private int quantity;

    public Product(String  productName, double price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
}

class Customer{
    private String customerName;
    private List<Product> products;

    public Customer(String customerName){
        this.customerName = customerName;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public List<Product> getProduct(){
        return products;
    }

    public String getCustomerName(){
        return customerName;
    }
}

class BillGenerator{
    public static double generateBill(Customer customer){
        double totalBill = 0;
        for(Product product : customer.getProduct()){
            int quantity = product.getQuantity();
            double price = product.getPrice();
            totalBill += quantity*price;
        }
        return totalBill;
    }
}

public class GroceryBillGenerator {
    public static void main(String[] args) {
        Product product1 = new Product("Apples", 3, 2);
        Product product2 = new Product("Milk", 2, 1);

        Customer customer = new Customer("Divit");

        customer.addProduct(product1);
        customer.addProduct(product2);

        Double totalBill = BillGenerator.generateBill(customer);
        System.out.println("=== Bill ===");
        System.out.println("\nCustomer name: " + customer.getCustomerName());
        System.out.println("\nQuantity\tPrice\tQuantity\tTotal");
        System.out.println(product1.getProduct()+"\t\t"+product1.getPrice()+"\t"+product1.getQuantity()+"\t\t"+(product1.getPrice()*product1.getQuantity()));
        System.out.println(product2.getProduct()+"\t\t"+product2.getPrice()+"\t"+product2.getQuantity()+"\t\t"+(product2.getPrice()*product2.getQuantity()));
        System.out.println("--------------------------------------------");
        System.out.println("Total Bill  \t\t" + totalBill);
    }
}
