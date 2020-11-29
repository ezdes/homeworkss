public class Horse {
    int weight;
    int age;
    String color;
    String sex;
    String nickname;

    public Horse() {
    }

    public Horse(int weight, int age, String color, String sex, String nickname) {
        this.weight = weight;
        this.color = color;
        this.sex = sex;
        this.nickname = nickname;
        setAge(age);
    }

    public void printHorse(){
        System.out.println(weight + " " + age + " " + color + " " + sex + " " + nickname);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
