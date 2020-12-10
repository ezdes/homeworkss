public class Credit {
    private int id;
    private double sum;
    private String period;
    private int interestRate;
    private static int amount;
    private static double totalSum;

    public Credit(){}

    public Credit(int id, double sum, String period, int interestRate) {
        this.id = id;
        this.sum = sum;
        this.period = period;
        this.interestRate = interestRate;
        amount++;
        totalSum += sum;
    }

    public static double averageSum(){
        return totalSum / amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        Credit.amount = amount;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Credit.totalSum = totalSum;
    }
}
