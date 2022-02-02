import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class List implements Comparable<List> {
    private Customer customer;
    private Product product;

    public List(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    private Date tinhNgayHetHan(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.customer.getNgaymua());
        calendar.add(Calendar.MONTH, this.product.getTgianBaoHanh());
        return calendar.getTime();
    }

    public int compareTo(List o){
        if(this.tinhNgayHetHan().equals(o.tinhNgayHetHan())){
            return this.customer.getMa().compareTo(o.customer.getMa());
        }
        return this.tinhNgayHetHan().compareTo(o.tinhNgayHetHan());
    }

    public String toString(){
        return customer + " " +  this.customer.getSoLuong() * this.product.getGiaBan() + " " + new SimpleDateFormat("dd/MM/yyyy").format(tinhNgayHetHan());
    }

}