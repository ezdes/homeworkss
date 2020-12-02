public class Acer extends Laptop {

    String coolerBoost;

    public Acer() {
    }

    public Acer(String processor, String videoCard, int ram, String os, String coolerBoost) {
        super(processor, videoCard, ram, os);
        this.coolerBoost = coolerBoost;
    }

    @Override
    public String toString(){
        return processor + " " + videoCard + " " + ram + " " + os + " " + coolerBoost;
    }

    @Override
    public void turnOff(){
        System.out.println("The Acer is turned off");
    }

    @Override
    public void turnOn(){
        System.out.println("The Acer is turned on");
    }

    public String getCoolerBoost() {
        return coolerBoost;
    }

    public void setCoolerBoost(String coolerBoost) {
        this.coolerBoost = coolerBoost;
    }
}
