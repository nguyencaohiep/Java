public class Product {
    private String id;
    private String name;
    private String unit;
    private long purchasePrice;
    private long price;

    public Product(String id, String name, String unit, String purchasePrice, String price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.purchasePrice = Long.parseLong(purchasePrice);
        this.price = Long.parseLong(price);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public long getPrice() {
        return price;
    }
}
