package employee_mgmt;

// Abstract Class Employee
public  abstract  class  Employee  {
    // Attributes
    private  int  employeeId;
    private  String name;
    private  double  baseSalary;
    // Constructor
    public  Employee  (  int  employeeId, String name,  double  baseSalary) {
        this  .employeeId = employeeId;
        this  .name = name;
        this  .baseSalary = baseSalary;
    }
    // Getter for employeeId
    public  int  getEmployeeId  (){
        return  employeeId;
    }
    // Setter for employeeId
    public  void  setEmployeeId  (  int  employeeId){
        this  .employeeId = employeeId;
    }
    public  String  getName  (){
        return  name;
    }
    // Setter for name
    public  void  setName  (String name){
        this  .name = name;
    }
    // Getter for salary
    public  double  getBaseSalary  (){
        return  baseSalary;
    }
    // Setter for salary
    public  void  setBaseSalary  (  double  baseSalary) {
        this  .baseSalary = baseSalary;
    }
    // Abstract method for calculate salary
    public  abstract  double  calculateSalary  ();
    // Method to display details
    public  void  displayDetails  (){
        System.out.println(  "\n=== Employee Details  ==="  );
        System.out.println(  "Name: "  + name);
        System.out.println(  "Employee Id: "  + employeeId);
        System.out.println(  "Salary: "  + baseSalary);
    }
}