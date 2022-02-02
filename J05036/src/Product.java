public class Product {
    private String id;
    private String name;
    private String unit;
    private int number;
    private int unitPrice;
    private int fee;
    private int money;
    private int price;

    public Product(int id, String name, String unit, int number, int unitPrice) {
        this.id = String.format("MH%02d", id);
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.fee = (int) (Math.round(unitPrice * number * 0.05));
        this.money = unitPrice * number + fee;
        this.price = (int) (Math.round(money + money * 0.02));
    }

    public String toString() {
        return id + " " + name + " " + unit + " " + fee + " " + money + " " + price;
    }
}
