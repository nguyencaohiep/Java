import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bill implements Comparable<Bill> {
    private String id;
    private String name;
    private String room;
    private LocalDate startDay;
    private LocalDate endDay;
    private Long days;
    private Integer price;
    private Integer outMoney;
    private Long sum;

    public Bill(int id, String name, String room, String startDay, String endDay, Integer outMoney) {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.room = room;
        String type = room.substring(0, 1);
        if (type.equals("1"))
            this.price = 25;
        else if (type.equals("2"))
            this.price = 34;
        else if (type.equals("3"))
            this.price = 50;
        else
            this.price = 80;
        String[] start = startDay.trim().split("/");
        String[] end = endDay.trim().split("/");
        this.startDay = LocalDate.of(Integer.parseInt(start[2]), Integer.parseInt(start[1]),
                Integer.parseInt(start[0]));
        this.endDay = LocalDate.of(Integer.parseInt(end[2]), Integer.parseInt(end[1]), Integer.parseInt(end[0]));
        this.days = ChronoUnit.DAYS.between(this.startDay, this.endDay) + 1;
        this.outMoney = outMoney;
        this.sum = this.days * this.price + this.outMoney;
    }

    public Long getSum() {
        return sum;
    }

    @Override
    public int compareTo(Bill o) {
        return this.getSum() < o.getSum() ? 1 : -1;
    }

    public String toString() {
        return id + " " + name + " " + room + " " + days + " " + sum;
    }

}
