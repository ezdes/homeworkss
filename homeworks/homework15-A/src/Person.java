import java.time.LocalDate;

public class Person {
    String name;
    String surname;
    String middleName;
    int birthYear;
    String hobby;
    String sex;


    public void displayPeople(){

        int year = LocalDate.now().getYear();

        if (hobby != null){
            System.out.println(name + " " + surname + " " + middleName + " " + (year - birthYear) + " " + hobby + " " + sex);
        }

        else {
            System.out.println(name + " " + surname + " " + middleName + " " + (year - birthYear) + " " + " " + sex);
        }
    }

    public Person(){

    }

    public Person(String name, String surname, String middleName, int birthYear, String hobby, String sex) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.hobby = hobby;
        this.sex = sex;
    }

    public Person(String name, String surname, String middleName, int birthYear, String sex){
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surName) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
