public class SanPham {
    private String ma;
    private String ten;
    private Integer donGia;
    private Double thue;

    public SanPham(String ma, String ten, Integer donGia, Double thue) {
        this.ma = ma;
        this.ten = ten;
        this.donGia = donGia;
        this.thue = thue;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public Integer getDonGia() {
        return donGia;
    }

    public Double getThue() {
        return thue;
    }
}
