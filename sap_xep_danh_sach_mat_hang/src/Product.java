public class Product {
    private String id;
    private String name;
    private String gr;
    private float buyMoney;
    private float price;

    public Product(int id, String name, String gr, float buyMoney, float price) {
        this.id = "" + id;
        this.name = name;
        this.gr = gr;
        this.buyMoney = buyMoney;
        this.price = price;
    }

    public float getProfit() {
        return price - buyMoney;
    }

    public String toString() {
        return id + " " + name + " " + gr + " " + String.format("%.2f", getProfit());
    }
}
