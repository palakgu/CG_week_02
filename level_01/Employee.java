public class Employee{
private String name;
private int id;
private double salary;

public Employee(String name, int id, double salary){
this.name=name;
this.id=id;
this.salary=salary;
}
public static void displayDetails(String name, int id, double salary){
System.out.println("employee name" +name);
System.out.println("employee id " +id);
System.out.println("employee salary" +salary);


}
public static void main(String args[]){
Employee obj = new Employee("savi",7,1000000);
displayDetails("savi",7,1000000);
}

}