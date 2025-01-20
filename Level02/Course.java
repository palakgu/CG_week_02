public class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Create instances of the Course class
        Course course1 = new Course("Java Programming", 10, 300);
        Course course2 = new Course("Web Development", 12, 350);

        // Display course details before updating institute name
        System.out.println("Before updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Update the institute name
        Course.updateInstituteName("Advanced Learning Institute");

        // Display course details after updating institute name
        System.out.println("After updating institute name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
