import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void printDetails() {
        System.out.println("Faculty Name: " + facultyName);
    }
}

class Department {
    private String DeptName;

    public Department(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void printDetails() {
        System.out.println("Department Name: " + DeptName);
    }
}


class University {
    private String UniversityName;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String UniversityName) {
        this.UniversityName = UniversityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartments() {
        System.out.println("Departments at " + UniversityName + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getDeptName());
        }
    }

    public void showFaculties() {
        System.out.println("Faculties at " + UniversityName + ":");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getFacultyName());
        }
    }

    public void deleteUniversity() {
        departments.clear();
        faculties.clear();
        System.out.println(UniversityName + " has been deleted, along with all its departments and faculty members.");
    }
}

public class UniversityFacultyDepartments {
    public static void main(String[] args) {
        University university = new University("Tech University");

        // Create departments
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Electrical Engineering");

        // Add departments to the university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");

        // Add faculty members to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Show departments and faculties
        university.showDepartments();
        university.showFaculties();

        // Demonstrate the composition relationship by deleting the university
        university.deleteUniversity();

        // Faculties still exist independently
        faculty1.printDetails(); // Should still print details of faculty1
        faculty2.printDetails(); // Should still print details of faculty2
    }
}
