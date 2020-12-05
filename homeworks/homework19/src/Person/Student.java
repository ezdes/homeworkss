package Person;

import Person.Person;

import java.time.LocalDate;

public class Student extends Person {
    private String id;

    public Student(){

    }

    public Student(LocalDate dateOfBirth, String surname, String name, String sex, int age, String id) {
        super(dateOfBirth, surname, name, age, sex);
        this.id = id;
    }

    @Override
    public String toString(){

        return getDateOfBirth() + " " + getSurname() + " " + getName() + " " + getSex() + " " + getAge() + " " + id + "\n";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
