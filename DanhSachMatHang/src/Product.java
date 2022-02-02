public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private String unit;
    private long profit;
    private long purchasePrice;
    private long price;

    public Product(int id, String name, String unit, long purchasePrice, long price) {
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.purchasePrice = purchasePrice;
        this.price = price;
        this.profit = price - purchasePrice;
    }

    public String getId() {
        return id;
    }

    public long getProfit(){
        return profit;
    }

    public int compareTo(Product o){
        if(this.getProfit() == o.getProfit())
            return this.id.compareTo(o.id);
        return Long.compare(o.profit, this.profit);
    }

    public String toString(){
        return id + " " + name + " " + unit + " " + purchasePrice + " " + price + " " + profit;
    }

}


