
import java.util.GregorianCalendar;

public class Student {
    GregorianCalendar dateOfBirth;
    String surName;
    String name;
    String sex;
    int age;

    public Student(){

    }

    public Student(GregorianCalendar dateOfBirth, String surName, String name, String sex, int age){
        this.dateOfBirth = dateOfBirth;
        this.surName = surName;
        this.name = name;
        this.sex = sex;
        setAge(age);
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }

        else
            System.out.println("Age can not be less than 0!");
    }
}
