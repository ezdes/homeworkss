import java.time.LocalDate;

public class Person {
    LocalDate dateOfBirth;
    String surname;
    String name;
    int age;
    String sex;

    public Person(){

    }

    public Person(LocalDate dateOfBirth, String surname, String name, int age, String sex) {
        this.dateOfBirth = dateOfBirth;
        this.surname = surname;
        this.name = name;
        setAge(age);
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }

        else
           throw new Error("Age can not be less than 0");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
