import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String action;

        Msi msi = new Msi("Intel i7-9750h", "Nvidia rtx 2070", 16, "Windows 10", true);
        System.out.println(msi);

        System.out.print("Do u wanna turn laptop on? Yes or No: ");
        action = scan.nextLine();

        if (action.equals("Yes"))
            msi.turnOn();

        else
            msi.turnOff();

        System.out.println();
        Acer acer = new Acer("Intel i5-9300h", "Nvidia gtx 1660 ti", 8, "Windows 10", "Cooler Boost 5");
        System.out.println(acer);

        System.out.print("Do u wanna turn laptop on? Yes or No: ");
        action = scan.nextLine();

        if (action.equals("Yes"))
            acer.turnOn();

        else
            acer.turnOff();

        System.out.println();
        Asus asus = new Asus("Intel i5-7600", "Nvida gtx 1060", 16, "Windows 7", "Intel 630");
        System.out.println(asus);

        System.out.print("Do u wanna turn laptop on? Yes or No: ");
        action = scan.nextLine();

        if (action.equals("Yes"))
            asus.turnOn();

        else
            asus.turnOff();

        System.out.println();
        Dell dell = new Dell("Amd Ryzen 7 2700X", "AMD Radeon RX 5600 XT", 8, "Ubuntu 20.04", 8);
        System.out.println(dell);

        System.out.print("Do u wanna turn laptop on? Yes or No: ");
        action = scan.nextLine();

        if (action.equals("Yes"))
            dell.turnOn();

        else
            dell.turnOff();
    }
}
