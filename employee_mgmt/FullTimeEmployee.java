package employee_mgmt;

public  class  FullTimeEmployee  extends  Employee  implements  Department  {
    // Class Attributes
    private  double  fixedSalary;
    private  String department;
    // Constructor
    public  FullTimeEmployee  (  int  employeeId, String  name,  double  baseSalary,
                                 double  fixedSalary){
// Calling super class constructor
        super  (employeeId, name, baseSalary);
        this  .fixedSalary = fixedSalary;
    }
    // Getter fot fixedSalary
    public  double  getFixedSalary  () {
        return  fixedSalary;
    }
    // Setter for FixedSalary
    public  void  setFixedSalary  (  double  fixedSalary)  {
        this  .fixedSalary = fixedSalary;
    }
    // Overriding Methods
    @Override
    public  void  assignDepartment  (String department){
        this  .department = department;
    }
    @Override
    public  String  getDepartmentDetails  (){
        return  department;
    }
    @Override
    public  double  calculateSalary  () {
        return  fixedSalary;
    }
    @Override
    public  void  displayDetails  () {
        super  .displayDetails();
        System.out.println(  "Full-Time Employee"  );
        System.out.println(  "Department: "  + getDepartmentDetails());
        System.out.println(  "Fixed Salary: "  + calculateSalary());
    }
}