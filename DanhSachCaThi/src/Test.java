import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test implements Comparable<Test> {
    private String id;
    private Date date;
    private String code;

    public Test(int id, String date, String time, String code) throws ParseException {
        this.id = String.format("C%03d", id);
        this.date = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(date + " " + time);
        this.code = code;
    }

    public Date getDate_Time() {
        return date;
    }

    public String getId() {
        return id;
    }

    public int compareTo(Test t) {
        if (this.getDate_Time().equals(t.getDate_Time())) {
            return this.getId().compareTo(t.getId());
        }
        return this.getDate_Time().compareTo(t.getDate_Time());
    }

    public String toString() {
        return id + " " + new SimpleDateFormat("dd/MM/yyyy HH:mm").format(date)+ " " + code;
    }
}

