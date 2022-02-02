public class Bill {
    private String id;
    private String name;
    private long number;
    private long unitPrice;
    private long discount;
    private long money;

    public Bill(String id, String name, long number, long unitPrice, long discount) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.money = number * unitPrice - discount;
    }

    public long getMoney() {
        return money;
    }

    public String toString() {
        return id + " " + name + " " + number + " " + unitPrice + " " + discount + " " + money;
    }


}
