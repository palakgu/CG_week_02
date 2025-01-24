import java.util.ArrayList;
import java.util.List;

class Student {
    private String studentName;
    private String studentId;
    private List<Course> courses;

    public Student(String studentName, String studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void showEnrolledCourses() {
        System.out.println("\nCourses enrolled by " + studentName + ":");
        for (Course course : courses) {
            course.printDetails();
        }
    }
}

class Professor {
    private String professorName;
    private String professorId;
    private List<Course> courses;

    public Professor(String professorName, String professorId) {
        this.professorName = professorName;
        this.professorId = professorId;
        this.courses = new ArrayList<>();
    }

    public String getProfessorName() {
        return professorName;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this);
        }
    }

    public void showAssignedCourses() {
        System.out.println("\nCourses taught by " + professorName + ":");
        for (Course course : courses) {
            course.printDetails();
        }
    }

    public void printDetails() {
        System.out.println("Professor Name: " + professorName);
    }
}

class Course {
    private String courseName;
    private List<Student> students;
    private Professor professor;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void printDetails() {
        System.out.println("Course Name: " + courseName + ", Professor: " + (professor != null ? professor.getProfessorName() : "None"));
    }

    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getStudentName());
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Algorithms");

        // Create professors
        Professor professor1 = new Professor("Dr. Smith", "P001");
        Professor professor2 = new Professor("Dr. Johnson", "P002");

        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Professors assign courses
        professor1.assignCourse(course1); // Dr. Smith teaches Data Structures
        professor2.assignCourse(course2); // Dr. Johnson teaches Algorithms

        // Students enroll in courses
        student1.enrollCourse(course1); // Alice enrolls in Data Structures
        student1.enrollCourse(course2); // Alice enrolls in Algorithms
        student2.enrollCourse(course1); // Bob enrolls in Data Structures

        // Show enrolled courses for students
        student1.showEnrolledCourses(); // Show courses Alice is enrolled in
        student2.showEnrolledCourses(); // Show courses Bob is enrolled in

        // Show assigned courses for professors
        professor1.showAssignedCourses(); // Show courses taught by Dr. Smith
        professor2.showAssignedCourses(); // Show courses taught by Dr. Johnson

        // Show enrolled students for each course
        course1.showEnrolledStudents(); // Show students in Data Structures
        course2.showEnrolledStudents(); // Show students in Algorithms
    }
}
