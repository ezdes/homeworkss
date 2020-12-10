public class Main {

    public static void main(String[] args) {

        Credit credit1 = new Credit(1, 20000, "11.07.2019-11.07.2020", 20);
        Credit credit2 = new Credit(2, 35500, "22.05.2010-22.05.2011", 15);
        Credit credit3 = new Credit(3, 44300, "30.01.2013-30.01.2014", 10);
        Credit credit4 = new Credit(4, 52600, "16.08.2019-16.08.2020", 5);
        Credit credit5 = new Credit(5, 65700, "02.05.2016-02.05.2017", 30);


        System.out.printf("Issued %d credits%n", Credit.getAmount());
        System.out.printf("Total sum: %.1f%n", Credit.getTotalSum());
        System.out.printf("Average sum: %.1f", Credit.averageSum());
    }
}
