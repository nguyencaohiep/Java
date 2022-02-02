public class DonHang implements Comparable<DonHang> {
    private String ma;
    private SanPham sp;
    private Long soLuong;

    public DonHang(String ma, Long soLuong, SanPham sp) {
        this.ma = ma;
        this.soLuong = soLuong;
        this.sp = sp;
    }

    public Long tinhThue() {
        if(nhaSanXuat().equals("Trong Nuoc")) {
            return sp.getDonGia() * soLuong * 0;
        }
        return (long) (sp.getDonGia() * soLuong * sp.getThue());
    }

    public Long tinhTien() {
        return sp.getDonGia() * soLuong + tinhThue();
    }

    public String nhaSanXuat() {
        String nsx = this.ma.substring(3);
        if (nsx.equals("BP")) {
            return "British Petro";
        } else if (nsx.equals("ES")) {
            return "Esso";
        } else if (nsx.equals("SH")) {
            return "Shell";
        } else if (nsx.equals("CA")) {
            return "Castrol";
        } else if (nsx.equals("MO")) {
            return "Mobil";
        }
        return "Trong Nuoc";
    }

    public String toString() {
        return ma + " " + nhaSanXuat() + " " + sp.getDonGia() + " " + tinhThue() + " " + tinhTien();
    }

    public int compareTo(DonHang o) {
        return -1 * this.tinhTien().compareTo(o.tinhTien());
    }
}
