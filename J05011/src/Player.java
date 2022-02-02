import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Player {
    private String id;
    private String name;
    private String time;
    private long minute;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(String timeStart, String timeEnd) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        Date start = format.parse(timeStart);
        Date end = format.parse(timeEnd);
        long tmp = (end.getTime() - start.getTime()) / 1000 / 60;
        this.minute = tmp;
        long hours = tmp / 60;
        long minutes = tmp % 60;
        this.time = Long.toString(hours) + " gio " + Long.toString(minutes) + " phut";
    }

    public long getMinute() {
        return minute;
    }

    public String toString() {
        return String.format("%s %s %s", id, name, time);
    }

}
