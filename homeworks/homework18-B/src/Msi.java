public class Msi extends Laptop {
    boolean hasIlluminationKeyboard;

    public Msi(){

    }

    public Msi(String processor, String videoCard, int ram, String os, boolean hasIlluminationKeyboard) {
        super(processor, videoCard, ram, os);
        this.hasIlluminationKeyboard = hasIlluminationKeyboard;
    }

    @Override
    public String toString(){
        return processor + " " + videoCard + " " + ram + " " + os + " " + hasIlluminationKeyboard;
    }

    @Override
    public void turnOff(){
        System.out.println("The Msi is turned off");
    }

    @Override
    public void turnOn(){
        System.out.println("The Msi is turned on");
    }

    public boolean isHasIlluminationKeyboard() {
        return hasIlluminationKeyboard;
    }

    public void setHasIlluminationKeyboard(boolean hasIlluminationKeyboard) {
        this.hasIlluminationKeyboard = hasIlluminationKeyboard;
    }
}
