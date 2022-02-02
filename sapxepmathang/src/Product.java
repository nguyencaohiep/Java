
public class Product implements Comparable<Product> {
    private String ma;
    private String ten;
    private String nhom;
    private float giaMua;
    private float giaBan;

    public Product(int ma, String ten, String nhom, float giaMua, float giaBan) {
        this.ma = String.format("MH%02d", ma);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public Float loiNhuan(){
        return this.giaBan - this.giaMua;
    }

    public String toString(){
        return ma + " " + ten + " " + nhom + " " + String.format("%.2f",loiNhuan());
    }

    @Override
    public int compareTo(Product p){
        return -1 * this.loiNhuan().compareTo(p.loiNhuan());
    }
}
