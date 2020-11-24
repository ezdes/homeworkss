
import java.util.GregorianCalendar;

public class Course {
    String name;
    GregorianCalendar dateOfCreation;
    String id;
    String fullName;

    public Course(){

    }

    public Course(String name, GregorianCalendar dateOfCreation, String id, String fullName){
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.id = id;
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(GregorianCalendar dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
