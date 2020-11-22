public class Main {

    public static void main(String[] args) {

        Student studentOne = new Student();
        studentOne.name = "Peter";
        studentOne.age = 19;
        studentOne.faculty = "Biology";
        studentOne.gpa = 3.4;

        Student studentTwo = new Student();
        studentTwo.name = "Kevin";
        studentTwo.age = 22;
        studentTwo.faculty = "Economy";
        studentTwo.gpa = 2.7;

        Student studentThree = new Student();
        studentThree.name = "Alan";
        studentThree.age = 18;
        studentThree.faculty = "Informatics";
        studentThree.gpa = 4.0;

        System.out.println(studentOne.name + " " + studentOne.age + " " + studentOne.faculty + " " + studentOne.gpa);
        System.out.println(studentTwo.name + " " + studentTwo.age + " " + studentTwo.faculty + " " + studentTwo.gpa);
        System.out.println(studentThree.name + " " + studentThree.age + " " + studentThree.faculty + " " + studentThree.gpa);
    }
}