package Multilevel_Inheritance;

 class Course {
    private String CourseName ;
    private int duration ;
    public Course(String CourseName , int duration){
        this.CourseName = CourseName;
        this.duration = duration;
    }

    public void displayDetails(){
        System.out.println(" the name of the course is "+ CourseName + " The duration of the course is "+ duration);
    }
    
}
class OnlineCourse extends Course{
private String platform ;
private String isRecorded;

public OnlineCourse(String CourseName , int duration , String platform , String isRecorded){
    super(CourseName, duration);
    this.platform = platform;
    this.isRecorded = isRecorded;
}
public void displayDetails(){
    super.displayDetails();
    System.out.println("  the platform for the course is "+ platform + " And the lecture are recorded or not " + isRecorded);
}
}
class  PaidOnlineCourse extends OnlineCourse{
    private double fees ;
    private double discount ;
    public PaidOnlineCourse(String CourseName , int duration , String platform , String isRecorded , double fees , double discount ){
        super(CourseName, duration, platform,isRecorded);
      this.fees = fees;
      this.discount = discount;

    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println(" The fees for the course is "+ fees +" with the discount "+ discount);
    }
}
public class CourseDetails{
    public static void main(String[] args) {
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("FullStack", 7, "Acciojob", "yes" , 70000 , 15000 );
        paidOnlineCourse.displayDetails();
    }
}
