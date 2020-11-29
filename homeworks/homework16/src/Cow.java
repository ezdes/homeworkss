import sun.plugin2.applet.Applet2IllegalArgumentException;

public class Cow {
    int weight;
    int age;
    String sex;
    String nickname;

    public Cow() {
    }

    public Cow(int weight, int age, String sex, String nickname) {
        this.weight = weight;
        this.sex = sex;
        this.nickname = nickname;
        setAge(age);
    }

    public void printCow(){
        System.out.println(weight + " " + age + " " + sex + " " + nickname);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }

        else  {
            throw new Error("Age can not be less than 0");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
