import java.text.SimpleDateFormat;
import java.util.Date;
public class Call {
    private String phoneNumber;
    private long time;
    private long price;
    private String nameCity;

    public Call(String phoneNumber, String startTime, String endTime,City city) throws Exception {
        this.phoneNumber = phoneNumber;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date timeStart = format.parse(startTime);
        Date timeEnd = format.parse(endTime);
        this.time = (timeEnd.getTime() - timeStart.getTime()) / 60000;
        this.nameCity = city.getName();
        this.price = this.time * city.getPriceCity();
    }

    public Call(String phoneNumber, String startTime, String endTime) throws Exception{
        this.phoneNumber = phoneNumber;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date timeStart = format.parse(startTime);
        Date timeEnd = format.parse(endTime);
        long tmp = (timeEnd.getTime() - timeStart.getTime()) / 60000;
        this.time = (tmp + (3 - tmp % 3)) / 3;
        this.nameCity = "Noi mang";
        this.price = this.time * 800;
    }

    public String toString() {

        return this.phoneNumber + " " + nameCity + " " + this.time + " " + this.price;

    }
}
