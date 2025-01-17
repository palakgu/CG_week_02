import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> cartItems; // List to store CartItem objects

    // Constructor
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println("Added " + itemName + " to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean found = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(i);
                System.out.println("Removed " + itemName + " from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Item " + itemName + " not found in the cart.");
        }
    }

    // Method to display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Method to display all items in the cart
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (CartItem item : cartItems) {
                item.displayItem();
            }
        }
    }

}