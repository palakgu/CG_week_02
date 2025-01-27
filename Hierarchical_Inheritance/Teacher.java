package Hierarchical_Inheritance;

class Teacher extends person {
    private String subject ;
    public Teacher(String name , int age , String subject){
        super(name , age );
        this.subject = subject ;
    }
    public void Displayrole(){
        super.Displayrole();
        System.out.println(" the role of the person is Teacher ");
        System.out.println("The Subject taught by the Teacher is "+ subject );
    }
}

