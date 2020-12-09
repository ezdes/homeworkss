
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineShop {
    private Ozon ozon;
    private Alibaba alibaba;
    private Amazon amazon;

    public OnlineShop(){

    }

    public OnlineShop(Ozon ozon, Alibaba alibaba, Amazon amazon) {
        this.ozon = ozon;
        this.alibaba = alibaba;
        this.amazon = amazon;
    }

    public void order(ArrayList<Product> products){
        Scanner scan = new Scanner(System.in);
        boolean isFound = false;
        int index = 0;
        String name;

        while (true) {

            if (products.isEmpty())
                System.exit(1);

            System.out.println("What do you wanna buy?");
            for (Product product : products) {
                System.out.println(product);
            }

            System.out.println();
            System.out.print("Enter a name: ");
            name = scan.nextLine();


            for (int i = 0; i < products.size(); i++) {
                if (name.equals(products.get(i).getName())) {
                    isFound = true;
                    index = i;
                    break;
                }
            }

            if (isFound) {

                System.out.println();
                System.out.println("Choose comfortable options:");
                System.out.println("Fast delivery - 1");
                System.out.println("Cheap delivery - 2");
                System.out.println("Safe product - 3");
                System.out.println("Cheap tax - 4");
                System.out.print("Your option: ");
                int option = scan.nextInt();


                if (option == 1 || option == 4){
                    System.out.println();
                    System.out.println("If you want a fast delivery or cheap tax, we recommend you a Ozon");
                    ozon.order(index);
                    System.out.println();
                    System.out.print("Do you wanna buy? Yes - 1 or No - 0: ");
                    int buy = scan.nextInt();
                    scan.nextLine();
                    if (buy == 1){
                        ozon.deliver(index);
                        ozon.sell(index);
                    }
                    isFound = false;
                    System.out.println();
                }

                else if (option == 2){
                    System.out.println();
                    System.out.println("If you want a cheap delivery, we recommend you a Alibaba");
                    alibaba.order(index);
                    System.out.println();
                    System.out.print("Do you wanna buy? Yes - 1 or No - 0: ");
                    int buy = scan.nextInt();
                    scan.nextLine();
                    if (buy == 1){
                        alibaba.deliver(index);
                        alibaba.sell(index);
                    }
                    isFound = false;
                    System.out.println();
                }

                else if (option == 3){
                    System.out.println();
                    System.out.println("If you want a safe product, we recommend you a Amazon");
                    amazon.order(index);

                    System.out.println();
                    System.out.print("Do you wanna buy? Yes - 1 or No - 0: ");
                    int buy = scan.nextInt();
                    scan.nextLine();
                    if (buy == 1){
                        amazon.deliver(index);
                        amazon.sell(index);
                    }
                    isFound = false;
                    System.out.println();
                }
            }
        }
    }


    public Ozon getOzon() {
        return ozon;
    }

    public void setOzon(Ozon ozon) {
        this.ozon = ozon;
    }

    public Alibaba getAlibaba() {
        return alibaba;
    }

    public void setAlibaba(Alibaba alibaba) {
        this.alibaba = alibaba;
    }

    public Amazon getAmazon() {
        return amazon;
    }

    public void setAmazon(Amazon amazon) {
        this.amazon = amazon;
    }
}
