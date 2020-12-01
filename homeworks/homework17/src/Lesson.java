import java.time.LocalDate;
import java.time.LocalTime;

public class Lesson {
    LocalDate dateOfThe;
    Student[] attendingStudents;
    Course course;
    LocalTime start;
    boolean hasHomework;
    boolean hasExam;

    public Lesson(){}

    public Lesson(LocalDate dateOfThe, Student[] attendingStudents, Course course, LocalTime start, boolean hasHomework, boolean hasExam) {
        this.dateOfThe = dateOfThe;
        this.attendingStudents = attendingStudents;
        this.course = course;
        this.start = start;
        this.hasHomework = hasHomework;
        this.hasExam = hasExam;
    }

    @Override
    public String toString(){
        String message = "Information about lesson:\n";

        message += "-------------------------------------\n";
        message += dateOfThe + "\n";

        for (Student attendingStudent : attendingStudents) {
            message += attendingStudent;
        }
        message += course + "" + start + " " + hasHomework + " " + hasExam + "\n";

        message += "-------------------------------------";
        return message;
    }
    public LocalDate getDateOfThe() {
        return dateOfThe;
    }

    public void setDateOfThe(LocalDate dateOfThe) {
        this.dateOfThe = dateOfThe;
    }

    public Student[] getAttendingStudents() {
        return attendingStudents;
    }

    public void setAttendingStudents(Student[] attendingStudents) {
        this.attendingStudents = attendingStudents;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public boolean isHasHomework() {
        return hasHomework;
    }

    public void setHasHomework(boolean hasHomework) {
        this.hasHomework = hasHomework;
    }

    public boolean isHasExam() {
        return hasExam;
    }

    public void setHasExam(boolean hasExam) {
        this.hasExam = hasExam;
    }
}
