import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Product product1 = new Product("Bed", 40, 35000);
        Product product2 = new Product("Sofa", 25, 15000);
        Product product3 = new Product("Laptop", 2, 30000);
        Product product4 = new Product("Door", 10, 10000);
        Product product5 = new Product("Cupboard", 20, 20000);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        Ozon ozon = new Ozon("Ozon", 20, 5, 5, 20, products);
        Alibaba alibaba = new Alibaba("Alibaba", 10, 9, 15, 14, products);
        Amazon amazon = new Amazon("Amazon", 35, 14, 15, 5, products);

        OnlineShop onlineShop = new OnlineShop(ozon, alibaba, amazon);
        onlineShop.order(products);
    }
}
