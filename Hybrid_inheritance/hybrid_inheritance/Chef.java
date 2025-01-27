package hybrid_inheritance;

class Chef extends person implements Worker{
    public Chef (String name , int id ){
        super(name, id);
    }
    public void performDuties(){
        System.out.println(" I an am Chef ");
        super.performDuties();
        System.out.println("-------------");
    }
}