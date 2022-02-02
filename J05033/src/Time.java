public class Time implements Comparable<Time> {
    private Integer hours;
    private Integer minutes;
    private Integer seconds;

    public Time(Integer hours, Integer minutes, Integer seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Integer getHours() {
        return hours;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public String toString() {
        return hours + " " + minutes + " " + seconds;
    }

    @Override
    public int compareTo(Time o) {
        if (this.getHours() == o.getHours()) {
            if (this.getMinutes() == o.getMinutes())
                return this.getSeconds().compareTo(o.getSeconds());
            return this.getMinutes().compareTo(o.getMinutes());
        }
        return this.getHours().compareTo(o.getHours());
    }
}
