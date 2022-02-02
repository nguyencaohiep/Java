public class City {
    private String id;
    private String name;
    private int priceCity;

    public City(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.priceCity = price;
    }

    public String getName(){
        return name;
    }

    public int getPriceCity() {
        return priceCity;
    }
}
