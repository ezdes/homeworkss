public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Ermek", "Nakypov", "Shekerbekovich", 2004, "Sleeping", "Male");
        Person person2 = new Person("Yagami", "Light", "Putinovich", 1995, "Killing people", "Male");
        Person person3 = new Person("Israel", "Adesanya", "Pythonovich", 1990, "Fighting", "Male");
        Person person4 = new Person("Asuna", "Yuuki", "Kiritovna", 2002, "Playing VR games", "Female");
        Person person5 = new Person("Kirigaya", "Kazuto", "Trumpovich", 2002, "Playing VR games", "Male");
        Person person6 = new Person("Rock", "Lee", "Narutovich", 1997,  "Male");
        Person person7 = new Person("Mai", "Sakurajima", "Ermekovna", 2000, "Modelling", "Female");
        Person person8 = new Person("Rustambek", "Bolotov", "Madarovich", 2001, "Eating", "Third gender");
        Person person9 = new Person("Kakashi", "Hatake", "Obitovich", 1987, "Reading", "Male");
        Person person10 = new Person("Jon", "Jones", "Danielovich", 1974,  "Male");

        Person[] people = {person1, person2, person3, person4, person5, person6, person7, person8, person9, person10};

        for (Person p : people)
            p.displayPeople();
    }
}
