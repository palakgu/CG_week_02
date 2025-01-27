package Hierarchical_Inheritance;


 class person {
    private String name ;
    private int age ;
    public person(String name , int age){
        this.name = name;
        this.age = age ;
    }
    public void Displayrole(){
        System.out.println(" the name of the person is " + name);
        System.out.println(" the age of the person is "+ age );
    }
    
}
