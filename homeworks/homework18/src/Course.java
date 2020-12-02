import java.time.LocalDate;

public class Course {
    String name;
    LocalDate dateOfCreation;
    String id;

    public Course(){

    }

    public Course(String name, LocalDate dateOfCreation, String id){
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.id = id;
    }

    @Override
    public String toString(){
        return name + " " + dateOfCreation + " " + id + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
