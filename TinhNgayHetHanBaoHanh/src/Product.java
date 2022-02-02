public class Product {
    private String ma;
    private String ten;
    private Long giaBan;
    private Integer tgianBaoHanh;

    public Product(String ma, String ten, Long giaBan, Integer tgianBaoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.tgianBaoHanh = tgianBaoHanh;
    }

    public Long getGiaBan() {
        return giaBan;
    }

    public Integer getTgianBaoHanh() {
        return tgianBaoHanh;
    }
}