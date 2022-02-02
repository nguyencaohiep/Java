import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String ma;
    private String ten;
    private String maPhong;
    private Date ngayDen;
    private Date ngayDi;

    public Customer(String ma, String ten, String maPhong, String ngayDen, String ngayDi) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.maPhong = maPhong;
        this.ngayDen = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDen);
        this.ngayDi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayDi);
    }

    public String getMaPhong(){
        return maPhong;
    }

    public Date getNgayDen() {
        return ngayDen;
    }

    public Date getNgayDi(){
        return ngayDi;
    }

    public String toString(){
        return ma + " " + ten + " " + maPhong;
    }

}
