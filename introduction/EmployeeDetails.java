 class Employee {
   String name ;
   int id;
   double salary;
   public Employee(String name , int id , double salary){
    this.name = name;
    this.id = id;
    this.salary= salary;
   } 
   public void displayDetails(){
    System.out.println("the Details of the Employee");
   }
}
class Manager extends Employee{
int teamSize ;
public Manager(String name , int id , double salary , int teamSize){
    super(name , id, salary);
    this.teamSize= teamSize;
}
public void displayDetails(){
System.out.println(" name of the manager "+ name +"\n id is "+ id +"\n with salary "+ salary + "\n team size  is "+ teamSize );
}
}
class Developer extends Employee{
String progLanguage ;
public Developer(String name , int id , double salary , String progLanguage){
    super(name , id , salary);
    this.progLanguage= progLanguage;
}
public void displayDetails(){
    System.out.println("Name of the Developer "+ name +"\n Id od the Employee is "+ id +"\n  with salary "+ salary +"\n the programming language of the developer is "+ progLanguage);
}
}
class Intern extends Employee{
int duration ;
public Intern(String name, int id, double salary , int duration){
    super(name , id ,salary);
    this.duration=duration;
}
public void displayDetails(){
    System.out.println("Name of the Intern "+ name +"\n Id of the Intern is "+ id +"\n  with salary "+ salary +"\n the Duration  of the Intern  is "+ duration +" months");   
}
}
public class EmployeeDetails{
    public static void main(String[] args){
       Manager manager = new Manager("raman", 0012 , 120000 , 6);
       Developer developer = new Developer("Akash", 1245, 70000, "Java");
       Intern intern = new Intern("Rajat", 02365, 50000, 6);

       manager.displayDetails();
       developer.displayDetails();
       intern.displayDetails();
    }
}