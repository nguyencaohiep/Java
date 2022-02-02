public class SanPham {
    private String ma;
    private String ten;
    private Integer giaL1;
    private Integer giaL2;

    public SanPham(String ma, String ten, Integer giaL1, Integer giaL2) {
        this.ma = ma;
        this.ten = ten;
        this.giaL1 = giaL1;
        this.giaL2 = giaL2;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public Integer getGiaL1() {
        return giaL1;
    }

    public Integer getGiaL2() {
        return giaL2;
    }
}
