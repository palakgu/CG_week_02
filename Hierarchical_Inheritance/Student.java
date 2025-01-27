package Hierarchical_Inheritance;

class Student extends person{
    private char grade ;
    public Student(String name , int age , char grade){
        super(name, age);
        this.grade = grade ;
    }
    public void Displayrole(){
        super.Displayrole();
        System.out.println("  the role of the person is Student ");
        System.out.println(" The grade of the Student is "+ grade);
    }
    }