package hybrid_inheritance;

public class personDetails{
    public static void main(String[] args) {
    Chef chef = new Chef("Rajan", 1234);
    Waiter waiter = new Waiter("Amit", 1256);
    chef.performDuties();
    waiter.performDuties();
    }
}
