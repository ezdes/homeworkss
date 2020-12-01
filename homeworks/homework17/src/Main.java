import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Course course = new Course("Java", LocalDate.of(2017, 7, 13), "JV-F20", "Itachi Uchiha");

        Student student1 = new Student(LocalDate.of(2004, 7, 22), "Uchiha", "Sasuke", "Male", 16);
        Student student2 = new Student(LocalDate.of(2004, 11, 12), "Uzumaki", "Naruto", "Male", 16);
        Student student3 = new Student(LocalDate.of(1997, 3, 2), "Senju", "Hashirama", "Male", 23);

        Student[] students = new Student[3];

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Group group = new Group(students, course, LocalDate.of(2017, 8, 3), 9);


        System.out.println(group);

        Student[] attendingStudents = {student3, student1};

        Lesson lesson = new Lesson(LocalDate.of(2017, 8, 3), attendingStudents, course, LocalTime.of(19, 30), false, true);

        System.out.println("\n");
        System.out.println(lesson);
    }
}
