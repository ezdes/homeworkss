package Bread;

import java.util.concurrent.TimeUnit;

public class Bread implements Bakeable, Edible {


    public Bread(){

    }

    @Override
    public void bake() throws InterruptedException {
        System.out.println("Started baking the bread.");
        System.out.println("Please wait 10 seconds...");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Finished baking the bread!!!");
        System.out.println();
    }

    @Override
    public void eat() {
        System.out.println("You can eat the bread.");
    }
}
