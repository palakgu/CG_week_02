import java.util.ArrayList;
import java.util.List;

class  Subject{
    private String subjectName;
    private int marks;

    public Subject(String Subject, int marks){
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjName(){
        return subjectName;
    }

    public int getMark(){
        return marks;
    }

}

class Student{
    private String stdName;
    private String stdId;
    private List<Subject> subjects;

    public Student(String stdName, String stdId){
        this.stdName = stdName;
        this.stdId = stdId;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
    }

    public int getSubjCount(){
        return subjects.size();
    }

    public List<Subject> getSubject(){
        return subjects;
    }

    public String getStdName(){
        return stdName;
    }

    public String getStdId(){
        return stdId;
    }
}

class GradeCalculator{
    public static String calculateGrade(Student student){
        int totalMarks = 0;
        int totalSubj = student.getSubjCount();

        if(totalSubj == 0){
            return "No subect available.";
        } else {

            for(Subject subject : student.getSubject()){
                totalMarks += subject.getMark();
            }

            double avg = (double)totalMarks/(double)totalSubj;
            
            if (avg >= 90) {
                return "A";
            } else if (avg >= 80) {
                return "B";
            } else if (avg >= 70) {
                return "C";
            } else if (avg >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    }
}

public class SchoolResultApplication{
    public static void main(String[] args) {
        
        Subject subj1 = new Subject("Maths", 89);
        Subject subj2 = new Subject("Chemistry", 92);
        Subject subj3 = new Subject("Physics", 85);

        Student student = new Student("Divit", "S018");

        student.addSubject(subj1);
        student.addSubject(subj2);
        student.addSubject(subj3);

        String Grade = GradeCalculator.calculateGrade(student);

        System.out.println("Student: " + student.getStdName() + " , Grade: "+ Grade);
    }
}