import java.util.Arrays;

public class Computer {
    Display display;
    String mark;
    String color;
    SolidStateDrive ssd;
    Ram ram;
    String videoCard;
    UsbPort[] usbPorts;
    Keyboard keyboard;


    public void display(){
        System.out.println(display.getMatrix() + " " + display.getDiagonal() + " " + display.getProducer());
        System.out.println(ssd.getMemorySize() + " " + ssd.getDivision());
        System.out.println(ram.getMemorySize() + " " + ram.getProducer());
        System.out.println(usbPorts[0].getType() + " " + usbPorts[0].getId());
        System.out.println(usbPorts[1].getType() + " " + usbPorts[1].getId());
        System.out.println(usbPorts[2].getType() + " " + usbPorts[2].getId());
        System.out.println(Arrays.toString(keyboard.keyboardLayout) + " " + keyboard.isHasBacklight() + " " + keyboard.isHasAdditionalNumbers());
    }

    public Computer(){

    }

    public Computer(Display display, String mark, String color, SolidStateDrive ssd, Ram ram,
                    String videoCard, UsbPort[] usbPorts, Keyboard keyboard) {
        this.display = display;
        this.mark = mark;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.videoCard = videoCard;
        this.usbPorts = usbPorts;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SolidStateDrive getSsd() {
        return ssd;
    }

    public void setSsd(SolidStateDrive ssd) {
        this.ssd = ssd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public UsbPort[] getUsbPorts() {
        return usbPorts;
    }

    public void setUsbPorts(UsbPort[] usbPorts) {
        this.usbPorts = usbPorts;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
