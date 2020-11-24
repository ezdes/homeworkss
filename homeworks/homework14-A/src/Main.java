public class Main {

    public static void main(String[] args) {

        Parrot parrot1 = new Parrot();
        parrot1.setName("Madara");
        parrot1.setAge(3);
        parrot1.setBreed("African Gray Parrot");
        parrot1.setColor("Gray");

        Parrot parrot2 = new Parrot();
        parrot2.setName("Akame");
        parrot2.setAge(2);
        parrot2.setBreed("Australian King Parrot");
        parrot2.setColor("Yellow");

        System.out.println(parrot1.getName() + " " + parrot1.getAge() + " " + parrot1.getBreed() + " " + parrot1.getColor());
        System.out.println(parrot2.getName() + " " + parrot2.getAge() + " " + parrot2.getBreed() + " " + parrot2.getColor());


        Dog dog1 = new Dog();
        dog1.setName("Ichigo");
        dog1.setAge(6);
        dog1.setBreed("Rottweiler");
        dog1.setHeight(65); // см

        Dog dog2 = new Dog();
        dog2.setName("Kakashi");
        dog2.setAge(4);
        dog2.setBreed("Bull Terrier");
        dog2.setHeight(49); // см

        System.out.println(dog1.getName() + " " + dog1.getAge() + " " + dog1.getBreed() + " " + dog1.getHeight());
        System.out.println(dog2.getName() + " " + dog2.getAge() + " " + dog2.getBreed() + " " + dog2.getHeight());

        Cat cat1 = new Cat();
        cat1.setName("Saitama");
        cat1.setAge(7);
        cat1.setSex("Male");
        cat1.setBreed("Munchkin cat");

        Cat cat2 = new Cat();
        cat2.setName("Lucifer");
        cat2.setAge(1);
        cat2.setSex("Male");
        cat2.setBreed("Lukoi cat");

        System.out.println(cat1.getName() + " " + cat1.getAge() + " " + cat1.getSex() + " " + cat1.getBreed());
        System.out.println(cat2.getName() + " " + cat2.getAge() + " " + cat2.getSex() + " " + cat2.getBreed());

        Fish fish1 = new Fish();
        fish1.setName("Khabib");
        fish1.setAge(2);
        fish1.setMemory(3); // seconds
        fish1.setEnvironment("Aquarium");

        Fish fish2 = new Fish();
        fish2.setName("Mizuhara");
        fish2.setAge(1);
        fish2.setMemory(10); // seconds
        fish2.setEnvironment("Ocean");

        System.out.println(fish1.getName() + " " + fish1.getAge() + " " + fish1.getMemory() + " " + fish1.getEnvironment());
        System.out.println(fish2.getName() + " " + fish2.getAge() + " " + fish2.getMemory() + " " + fish2.getEnvironment());
    }
}
