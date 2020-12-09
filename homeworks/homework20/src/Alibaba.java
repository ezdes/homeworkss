import java.util.ArrayList;

public class Alibaba  {
    private String name;
    private int deliveryTime;
    private int deliveryOneKilogram;
    private int tax;
    private int riskToLose;
    private double total = 1;
    private ArrayList<Product> products;


    public Alibaba(){

    }

    public Alibaba(String name, int deliveryOneKilogram, int deliveryTime, int tax, int riskToLose, ArrayList<Product> products) {
        this.name = name;
        this.deliveryTime = deliveryTime;
        this.deliveryOneKilogram = deliveryOneKilogram;
        this.tax = tax;
        this.riskToLose = riskToLose;
        this.products = products;
    }

    public void sell(int index){
        products.remove(index);
    }

    public void order(int index){

        double weight = products.get(index).getWeight();
        double deliveryPrice = 0;
        System.out.println("The delivery time: " + deliveryTime);
        for (int i = 1; i <= weight; i++){
            deliveryPrice += deliveryOneKilogram;
        }

        total += products.get(index).getPrice() + deliveryPrice;
        System.out.println("The delivery price: " + deliveryPrice);
        double taxFromPrice = products.get(index).getPrice() * (tax * 1.0 / 100);
        total += taxFromPrice;
        System.out.println("Tax: " + taxFromPrice);

        if (products.get(index).getPrice() > 10000){
            System.out.println("Risk to lose product: " + riskToLose + "%");
        }
        System.out.printf("Total price: %.2f", total);

    }

    public void deliver(int index){
        System.out.println("The product " + products.get(index).getName() + " will be delivered in " + deliveryTime +" days");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryOneKilogram() {
        return deliveryOneKilogram;
    }

    public void setDeliveryOneKilogram(int deliveryOneKilogram) {
        this.deliveryOneKilogram = deliveryOneKilogram;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getRiskToLose() {
        return riskToLose;
    }

    public void setRiskToLose(int riskToLose) {
        this.riskToLose = riskToLose;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
