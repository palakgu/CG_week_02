package hybrid_inheritance;

class Waiter extends person implements Worker {
    public Waiter(String name , int id ){
        super(name, id);
    }
    public void performDuties(){
        System.out.println(" I am Waiter");
        super.performDuties();
        System.out.println("------------");
    }
}