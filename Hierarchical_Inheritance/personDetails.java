
package Hierarchical_Inheritance ;

public class personDetails{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Eisha", 32, "Science");
        Student student = new Student("Rajat", 21, 'B');
        Staff staff = new Staff("Meena", 28, "Management");
        teacher.Displayrole();
        student.Displayrole();
        staff.Displayrole();
    }
}
