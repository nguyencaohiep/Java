public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private long price;
    private int time;

    public Product(String id, String name, long price, int time) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public int compareTo(Product o){
        if(this.price == o.price)
            return this.id.compareTo(o.id);
        return Long.compare(this.price, o.price)*-1;
    }

    public String toString(){
        return id + " " + name + " " + price + " " + time;
    }
}
