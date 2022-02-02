public class HoaDon implements Comparable<HoaDon> {
    private String ma;
    private SanPham sp;
    private Long soLuong;

    public HoaDon(String ma, Long soLuong, SanPham sp) {
        this.ma = ma;
        this.soLuong = soLuong;
        this.sp = sp;
    }

    public Long thanhTien(){
        String loai = this.ma.charAt(2) + "";
        if(loai.equals("1")) {
            return this.soLuong * sp.getGiaL1();
        }
        return this.soLuong*sp.getGiaL2();
    }

    public Long giamGia(){
        long tmp = thanhTien();
        if(soLuong >= 150){
            return (long)(tmp * 50/100.0);
        }
        else if(soLuong >= 100){
            return (long)(tmp * 30/100.0);
        }
        else if(soLuong >= 50){
            return (long) (tmp * 15 / 100.0);
        }
       return tmp*0;
    }

    public Long tienPhaiTra(){
        return thanhTien() - giamGia();
    }

    public String toString(){
        return ma + " " + sp.getTen() + " " + giamGia() + " " + tienPhaiTra();
    }

    public int compareTo(HoaDon o){
        return -1 * this.tienPhaiTra().compareTo(o.tienPhaiTra());
    }

}
