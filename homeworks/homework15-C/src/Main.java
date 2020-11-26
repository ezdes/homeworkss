public class Main {

    public static void main(String[] args) {


        UsbPort usbPort1 = new UsbPort(3.0, 1);
        UsbPort usbPort2 = new UsbPort(3.0, 2);
        UsbPort usbPort3 = new UsbPort(2.0, 3);


        UsbPort[] usbPorts = new UsbPort[3];
        usbPorts[0] = usbPort1;
        usbPorts[1] = usbPort2;
        usbPorts[2] = usbPort3;

        String[] keyboardLayout = {"Ru", "En"};
        Computer computer = new Computer(new Display(15, "Msi",  "TFT IPS"),
                                         "Msi", "Black",
                                         new SolidStateDrive(512, 2),
                                         new Ram(16, "Msi"),
                                         "Nvidia rtx 2070",
                                         usbPorts, new Keyboard(keyboardLayout, true, false));

        computer.display();
    }
}
