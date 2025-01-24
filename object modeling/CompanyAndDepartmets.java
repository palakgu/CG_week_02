import java.util.ArrayList;
import java.util.List;

class Employee {
    private String empName;
    private String position;

    public Employee(String empName, String position) {
        this.empName = empName;
        this.position = position;
    }

    public String getName() {
        return empName;
    }

    public String getPosition() {
        return position;
    }
}

class Department{
    private String deptName;
    private List<Employee> employees;
    
    public Department(String deptName){
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public String getDeptName(){
        return deptName;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

class Company {
    private static String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void printDetails() {
        System.out.println("Company Name: " + companyName);
        for (Department department : departments) {
            System.out.println("\tDepartment Name: " + department.getDeptName());
            for (Employee employee : department.getEmployees()) {
                System.out.println("\t\tEmployee Name: " + employee.getName() + ", Position: " + employee.getPosition());
            }
        }
    }
}

public class CompanyAndDepartmets {
    public static void main(String[] args) {
        Company company = new Company("CG Tech Innovators");

        Department dept1 = new Department("Research and Development");
        Department dept2 = new Department("Sales and Marketing");

        dept1.addEmployee(new Employee("Alice", "Engineer"));
        dept1.addEmployee(new Employee("Bob", "Scientist"));
        dept2.addEmployee(new Employee("Charlie", "Sales Manager"));
        dept2.addEmployee(new Employee("Daisy", "Marketing Specialist"));

        company.addDepartment(dept1);
        company.addDepartment(dept2);

        company.printDetails();
    }
}
