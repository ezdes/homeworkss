public class Laptop {
    String processor;
    String videoCard;
    int ram;
    String os;

    public Laptop(){

    }

    public Laptop(String processor, String videoCard, int ram, String os) {
        this.processor = processor;
        this.videoCard = videoCard;
        this.ram = ram;
        this.os = os;
    }

    @Override
    public String toString(){
        return processor + " " + videoCard + " " + ram + " " + os;
    }

    public void turnOff(){
        System.out.println("The laptop is turned off");
    }

    public void turnOn(){
        System.out.println("The laptop is turned on");
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
