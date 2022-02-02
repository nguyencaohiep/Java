import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String ma;
    private String hoVaTen;
    private String diaChi;
    private String maSP;
    private Integer soLuong;
    private Date ngaymua;
    private String day;

    public Customer(String ma, String hoVaTen, String diaChi, String maSP, Integer soLuong, String ngaymua) throws ParseException {
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
        this.maSP = maSP;
        this.soLuong = soLuong;
        this.day = ngaymua.substring(0,2);
        this.ngaymua = new SimpleDateFormat("dd/MM/yyyy").parse(ngaymua);
    }

    public String getDay() {
        return day;
    }

    public String getMa() {
        return ma;
    }

    public String getMaSP() {
        return maSP;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public String toString(){
        return ma + " " + hoVaTen + " " + diaChi + " " + maSP;
    }
}