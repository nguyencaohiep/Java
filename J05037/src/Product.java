
public class Product {
    private String id;
    private String name;
    private String unit;
    private long number;
    private long unitPrice;
    private long fee;
    private long money;
    private long price;

    public Product(int id, String name, String unit, long unitPrice, long number) {
        this.id = String.format("MH%02d", id);
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.number = number;
        this.fee = (long) (Math.round(unitPrice * number * 5 / 100.0));
        this.money = unitPrice * number + fee;
        double tmp = this.money * 102 / 100.0 / number;
        this.price = (long) Math.ceil(tmp / 100) * 100;
    }

    public long getPrice() {
        return price;
    }

    public String toString() {
        return id + " " + name + " " + unit + " " + fee + " " + money + " " + price;
    }
}

