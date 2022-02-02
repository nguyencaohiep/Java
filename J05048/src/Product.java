public class Product {
    private String codeProduct;
    private int inputQuantity;
    private int outputQuantity;
    private double taxPercent;
    private int price;


    public Product(String codeProduct, int number) {
        this.codeProduct = codeProduct;
        char first = Character.toUpperCase(codeProduct.charAt(0));
        char end = Character.toUpperCase(codeProduct.charAt(4));
        if (end == 'Y')
            this.price = 110000;
        else
            this.price = 135000;
        if (first == 'A') {
            if (end == 'Y')
                taxPercent = 0.08;
            else
                taxPercent = 0.11;
        } else {
            if (end == 'Y')
                taxPercent = 0.17;
            else
                taxPercent = 0.22;
        }
        this.inputQuantity = number;
        double tmp = 1;
        if (first == 'A')
            tmp = inputQuantity * 0.6;
        else
            tmp = inputQuantity * 0.7;
        outputQuantity = (int) (Math.round(tmp));
    }

    public int getMoneyTax() {
        int money = outputQuantity * price;
        return (int) (taxPercent * money);
    }

    public String getCode() {
        return "" + codeProduct.charAt(0);
    }

    public String toString() {
        int money = outputQuantity * price;
        return codeProduct + " " + inputQuantity + " " + outputQuantity + " " + price + " " + money + " " +
                (int) (money * taxPercent);
    }
}
