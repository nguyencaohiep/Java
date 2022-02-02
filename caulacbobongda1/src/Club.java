public class Club {
    private String id;
    private String name;
    private int price;

    public Club(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return this.name;
    }
}
