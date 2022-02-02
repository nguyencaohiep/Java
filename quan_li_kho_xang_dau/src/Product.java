public class Product implements Comparable<Product> {
    private String id;
    private long number;
    private String brand;
    private long unitPrice;
    private double tax;

    public Product(String input) {
        String[] tmp = input.trim().replace("\\s+", " ").split(" ");
        this.id = tmp[0];
        String t = id.substring(0, 1);
        if (t.equals("X")) {
            this.unitPrice = 128000;
            tax = 3 / 100.0;
        } else if (t.equals("D")) {
            this.unitPrice = 11200;
            tax = 3.5 / 100.0;
        } else {
            this.unitPrice = 9700;
            tax = 2 / 100.0;
        }

        String b = this.id.substring(3);
        if (b.equals("BP")) {
            this.brand = "British Petro";
        } else if (b.equals("SH")) {
            this.brand = "Shell";
        } else if (b.equals("ES")) {
            this.brand = "Esso";
        } else if (b.equals("CA")) {
            this.brand = "Castrol";
        } else if (b.equals("TN")) {
            this.brand = "Trong Nuoc";
            this.tax = 0;
        } else {
            this.brand = "Mobil";
        }

        this.number = Long.parseLong(tmp[1]);
    }

    public long getTax() {
        return (long) (tax * unitPrice * number);
    }

    public long getSum() {
        return getTax() + unitPrice * number;
    }

    @Override
    public String toString() {
        return id + " " + brand + " " + unitPrice + " " + getTax() + " " + getSum();
    }


    @Override
    public int compareTo(Product o) {
        if (this.getSum() > o.getSum())
            return -1;
        else if (this.getSum() < o.getSum())
            return 1;
        else
            return 0;
    }
}
