
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

    Course course = new Course("Java", new GregorianCalendar(2017, Calendar.JULY, 13), "JVF-20", "Itachi Uchiha");

    Student student1 = new Student(new GregorianCalendar(2004, Calendar.JULY, 22), "Uchiha", "Sasuke", "Male", 16);
    Student student2 = new Student(new GregorianCalendar(2000, Calendar.MARCH, 13), "Uzumaki", "Naruto", "Male", 16);
    Student student3 = new Student(new GregorianCalendar(1997, Calendar.JANUARY, 4), "Senju", "Hashirama", "Male", 23);

    Student[] students = new Student[3];

    students[0] = student1;
    students[1] = student2;
    students[2] = student3;

    Group group = new Group(students, course, new GregorianCalendar(2017, Calendar.AUGUST, 3), 9);

    System.out.println("The name of the course: " + course.name);
    System.out.println("The date of creation of the course: " + course.dateOfCreation.getTime());
    System.out.println("The id of the course: " + course.id);
    System.out.println("The mentor: " + course.getFullName());

    System.out.println();

    for (Student student : group.getStudentsArray()){
        System.out.println("Students: " + student.getName());
    }

    System.out.println();

    System.out.println("The start day of the course: " + group.getStart().getTime());
    System.out.println("The duration of the course: " + group.getDuration());

    }
}
