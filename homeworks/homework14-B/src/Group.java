
import java.util.GregorianCalendar;

public class Group {
    Student[] studentsArray;
    Course course;
    GregorianCalendar start;
    int duration;

    public Group(){
    }

    public Group(Student[] studentsArray, Course course, GregorianCalendar start, int duration){
        this.studentsArray = studentsArray;
        this.course = course;
        this.start = start;
        this.duration = duration;

    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public GregorianCalendar getStart() {
        return start;
    }

    public void setStart(GregorianCalendar start) {
        this.start = start;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
