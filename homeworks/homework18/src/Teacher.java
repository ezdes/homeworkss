import java.time.LocalDate;

public class Teacher extends Person {

    String phoneNumber;

    public Teacher() {
    }

    public Teacher(LocalDate dateOfBirth, String surname, String name, int age, String sex, String phoneNumber) {
        super(dateOfBirth, surname, name, age, sex);
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString(){
        return "\n" + surname + " " + name + " " + dateOfBirth + " " + age + " " + sex + " " + phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
