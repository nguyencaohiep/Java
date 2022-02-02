public class LopHoc implements Comparable<LopHoc> {
    private String maNhom;
    private String maMon;
    private String tenMon;
    private String ngayDay;
    private String kipHoc;
    private String tenGV;
    private String phongHoc;

    public LopHoc(String maNhom, String maMon, String tenMon, String ngayDay, String kipHoc, String tenGV, String phongHoc) {
        this.maNhom = maNhom;
        this.maMon = maMon;
        this.ngayDay = ngayDay;
        this.tenMon = tenMon;
        this.kipHoc = kipHoc;
        this.tenGV = tenGV;
        this.phongHoc = phongHoc;
    }


    public String getTenGV() {
        return tenGV;
    }

    public String toString(){
        return maNhom + " " + tenMon + " " + ngayDay + " " + kipHoc + " " + phongHoc;
    }

    public int compareTo(LopHoc o){
        if(this.ngayDay.equals(o.ngayDay)){
            if(this.kipHoc.equals(o.kipHoc)){
                return this.tenGV.compareTo(o.tenGV);
            }
            return this.kipHoc.compareTo(o.kipHoc);
        }
        return this.ngayDay.compareTo(o.ngayDay);
    }
}
