import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Athlete {
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private Integer startTime;
    private Integer endTime;
    private Integer bonusTime;
    private Integer time;
    private Integer timeToRank;
    private int rank;

    public Athlete(int id, String name, String dateOfBirth, String startTime, String endTime) {
        this.id = String.format("VDV%02d", id);
        this.name = name;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String[] tmp = dateOfBirth.split("/");
        int age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(tmp[2]);
        if (age < 18)
            this.bonusTime = 0;
        else if (age < 25)
            this.bonusTime = 1;
        else if (age < 32)
            this.bonusTime = 2;
        else
            this.bonusTime = 3;
        this.startTime = LocalTime.parse(startTime).toSecondOfDay();
        this.endTime = LocalTime.parse(endTime).toSecondOfDay();
        this.time = this.endTime - this.startTime;
        this.timeToRank = this.time - this.bonusTime;
    }

    public Integer getTimeToRank() {
        return timeToRank;
    }

    private String secondToString(Integer second) {
        return String.format("%02d:%02d:%02d",
                second / 3600,
                second / 60,
                second % 60
        );
    }

    public String toString() {
        return id + " " + name + " " + secondToString(time) + " " + secondToString(bonusTime) + " " + secondToString(timeToRank) + " ";
    }
}
