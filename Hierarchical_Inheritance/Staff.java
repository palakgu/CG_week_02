package Hierarchical_Inheritance;

class Staff extends person{
    private String proffesion ;
    public Staff(String name , int age , String proffesion ){
        super(name, age);
        this.proffesion = proffesion;
    }
    public void Displayrole(){
        super.Displayrole();
        System.out.println(" The role of the person is staff ");
        System.out.println(" the proffession of the Staff is "+ proffesion);
    }
    
    }