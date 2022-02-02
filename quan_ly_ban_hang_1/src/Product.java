public class Product {
    private String idPr;
    private String name;
    private String unit;
    private long buyMoney;
    private long price;

    public Product() {
    }

    public Product(int idPr, String name, String unit, long buyMoney, long price) {
        this.idPr = String.format("MH%03d", idPr);
        this.name = name;
        this.unit = unit;
        this.buyMoney = buyMoney;
        this.price = price;
    }

    public String getIdPr() {
        return idPr;
    }

    public long getPrice() {
        return price;
    }

    public String toString() {
        return name + " " + unit + " " + buyMoney + " " + price;
    }
}
