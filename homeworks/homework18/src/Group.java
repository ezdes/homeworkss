import java.time.LocalDate;

public class Group {
    Student[] studentsArray;
    Course course;
    LocalDate start;
    int duration;
    Teacher teacher;

    public Group(){
    }

    public Group(Student[] studentsArray, Course course, LocalDate start, int duration, Teacher teacher){
        this.studentsArray = studentsArray;
        this.course = course;
        this.start = start;
        this.duration = duration;
        this.teacher = teacher;

    }

    @Override
    public String toString(){

        String message = "Information about group:\n";

        message += teacher + "\n";
        message += "-------------------------------------\n";
        for (Student student : studentsArray) {
            message += student;
        }
        message +=  course + "" +  start + " " + duration + "\n";
        message += "-------------------------------------";
        return message;
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

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}