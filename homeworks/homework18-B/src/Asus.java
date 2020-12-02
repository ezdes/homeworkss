public class Asus extends Laptop {
    String discreteProcessor;

    public Asus() {
    }

    public Asus(String processor, String videoCard, int ram, String os, String discreteProcessor) {
        super(processor, videoCard, ram, os);
        this.discreteProcessor = discreteProcessor;
    }

    @Override
    public String toString(){
        return processor + " " + videoCard + " " + ram + " " + os + " " + discreteProcessor;
    }

    @Override
    public void turnOff(){
        System.out.println("The Asus is turned off");
    }

    @Override
    public void turnOn(){
        System.out.println("The Asus is turned on");
    }

    public String getDiscreteProcessor() {
        return discreteProcessor;
    }

    public void setDiscreteProcessor(String discreteProcessor) {
        this.discreteProcessor = discreteProcessor;
    }
}
