
public class Student{
String name;
int rollno;
double marks;

public Student(String name , int rollno , double marks){

this.name = name;
this.rollno = rollno;
this.marks = marks;
}
public static void Display(String name , int rollno , double marks){
System.out.println("The name of the student is "+ name);
System.out.println(" The roll no of the Student is "+ rollno);
System.out.println("The marks of the Student is "+ marks);
Marks(marks);
}
public static void Marks(double marks){
if(marks>90){
 System.out.println("The grade of the Student is "+"A");
} else 
if(marks>80){
 System.out.println("The grade of the Student is "+"B");
} else
if(marks>70){
 System.out.println("The grade of the Student is "+"C");
} else 
if(marks>60){
 System.out.println("The grade of the Student is "+"D");
}
else {
System.out.println("THe grade of the Student is "+ " E ");
}
}
public static void main(String[] args){
Student obj = new Student(" Amit ", 109 , 87);
Display(" Amit ", 109 , 87);

}

}