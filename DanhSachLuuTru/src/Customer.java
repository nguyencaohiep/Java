import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Customer {
    private String id;
    private String name;
    private String idRoom;
    private Date joinDate;
    private Date leaveDate;
    private long days;

    public Customer(int id, String name, String idRoom, String joinDate, String leaveDate) throws ParseException {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.idRoom = idRoom;
        this.joinDate = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);
        this.leaveDate = new SimpleDateFormat("dd/MM/yyyy").parse(leaveDate);
        long time = this.leaveDate.getTime() - this.joinDate.getTime();
        this.days = (time / (1000*60*60*24));
    }

    public long getDays(){
        return days;
    }

    public String toString(){
        return id + " " + name + " " + idRoom + " " + days;
    }
}
