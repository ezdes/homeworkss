public class Dell extends Laptop {
    int secondRam;

    public Dell() {
    }

    public Dell(String processor, String videoCard, int ram, String os, int secondRam) {
        super(processor, videoCard, ram, os);
        this.secondRam = secondRam;
    }

    @Override
    public String toString(){
        return processor + " " + videoCard + " " + ram + " " + os + " " + secondRam;
    }

    @Override
    public void turnOff(){
        System.out.println("The Dell is turned off");
    }

    @Override
    public void turnOn(){
        System.out.println("The Dell is turned on");
    }

    public int getSecondRam() {
        return secondRam;
    }

    public void setSecondRam(int secondRam) {
        this.secondRam = secondRam;
    }
}
