public class Bill {
    private String id;
    private String nameCus;
    private String addressCus;
    private String namePro;
    private int number;
    private int price;
    private int profit;

    public Bill(int id, String nameCus, String addressCus, String namePro, int number, int price, int profit) {
        this.id = String.format("HD%03d", id);
        this.nameCus = nameCus;
        this.addressCus = addressCus;
        this.namePro = namePro;
        this.number = number;
        this.price = price;
        this.profit = profit;
    }

    public int getProfit() {
        return profit;
    }

    public String toString() {
        return id + " " + nameCus + " " + addressCus + " " + namePro + " " + number + " " + price + " " + profit;
    }
}
