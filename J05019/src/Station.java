import java.time.LocalTime;

public class Station {
    private String id;
    private String name;
    private String start;
    private String end;
    private Integer number;
    private long time;
    private Double hours;

    public Station(String name, String start, String end, Integer number) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.number = number;
        this.time = LocalTime.parse(end).toSecondOfDay() - LocalTime.parse(start).toSecondOfDay();
        this.hours = this.time / 60 / 60.0;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = String.format("T%02d", i);
    }

    public void addNumber(Integer b) {
        this.number += b;
    }

    public long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public void setHours(Long time) {
        this.hours = this.time / 60 / 60.0;
    }

    public String toString() {
        double res = this.number / this.hours;
        return id + " " + name + " " + String.format("%.2f", res);
    }
}
