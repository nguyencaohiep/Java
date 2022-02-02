public class MonHoc implements Comparable<MonHoc> {
    private String ten;
    private String ma;
    private Integer soTin;
    private String hinhThucDay;
    private String hinhThucTH;

    public MonHoc(String ma, String ten, Integer soTin, String hinhThucDay, String hinhThucTH) {
        this.ten = ten;
        this.ma = ma;
        this.soTin = soTin;
        this.hinhThucDay = hinhThucDay;
        this.hinhThucTH = hinhThucTH;
    }

    public String getHinhThucTH() {
        return hinhThucTH;
    }

    public String getMa() {
        return ma;
    }

    public int compareTo(MonHoc o){
        return this.getMa().compareTo(o.getMa());
    }

    public String toString(){
        return ma + " " + ten + " " + soTin + " " + hinhThucDay + " " + hinhThucTH;
    }
}
