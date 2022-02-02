import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Call implements Comparable <Call>{
    private String phoneNumber;
    private Date timeStart;
    private Date timeEnd;
    private City city;

    public Call(String phoneNumber, String timeStart, String timeEnd, City city) throws ParseException{
        this.phoneNumber = phoneNumber;
        this.timeStart = new SimpleDateFormat("HH:mm").parse(timeStart);
        this.timeEnd = new SimpleDateFormat("HH:mm").parse(timeEnd);
        this.city = city;
    }

    public long calcMinutes(){
        long tmp = (timeEnd.getTime() - timeStart.getTime()) / 60000;
        if(this.phoneNumber.charAt(0) != '0'){
            while(tmp % 3 != 0){
                tmp += 1;
            }
            tmp /= 3;
        }
        return tmp;
    }

    public Long calcMoney(){
        return city.getPrice()*calcMinutes();
    }

    public String toString(){

        return phoneNumber + " " +  city.getName() + " " + calcMinutes() + " " + city.getPrice()*calcMinutes();
    }

    public int compareTo(Call o){
        return o.calcMoney().compareTo(this.calcMoney());
    }
}
