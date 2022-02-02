public class Product {
    private String id;
    private String name;
    private String unit;
    private int purchasePrice;
    private int price;

    public Product(int id, String name, String unit, int purchasePrice, int price) {
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getProfit() {
        return price - purchasePrice;
    }

}
