public class Product {
    private String name;
    private String id;
    private int numbers;
    private int prices;
    private double discountPercent;
    private int discountMoney;


    public Product(String id, String name, int numbers, int prices) {
        this.name = name;
        this.id = id;
        this.numbers = numbers;
        if (numbers > 10)
            discountPercent = 0.05;
        else if (numbers >= 8)
            discountPercent = 0.02;
        else if (numbers >= 5)
            discountPercent = 0.01;
        else
            discountPercent = 0;
        this.prices = prices;
        this.discountMoney = (int) (prices * discountPercent * numbers);
    }

    public String toString() {
        return id + " " + name + " " + discountMoney + " " + (prices * numbers - discountMoney);
    }

}
