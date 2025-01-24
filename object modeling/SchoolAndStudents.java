import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String studentId;
    private List<Course> courses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println("\nCourses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

class School {
    private String schoolName;
    private List<Course> courses;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showCourses() {
        System.out.println("\nCourses offered by " + schoolName + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

public class SchoolAndStudents {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Sunnyvale High School");

        // Create courses
        Course mathCourse = new Course("Mathematics");
        Course scienceCourse = new Course("Science");

        // Add courses to the school
        school.addCourse(mathCourse);
        school.addCourse(scienceCourse);

        // Create students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll students in courses
        student1.enrollInCourse(mathCourse); // Alice enrolls in Mathematics
        student1.enrollInCourse(scienceCourse); // Alice enrolls in Science
        student2.enrollInCourse(mathCourse); // Bob enrolls in Mathematics

        // Show enrolled students for each course
        mathCourse.showEnrolledStudents(); // Show students in Mathematics
        scienceCourse.showEnrolledStudents(); // Show students in Science

        // Show all courses offered by the school
        school.showCourses();

        // Show courses enrolled by each student
        student1.showEnrolledCourses(); // Show courses Alice is enrolled in
        student2.showEnrolledCourses(); // Show courses Bob is enrolled in
    }
}
