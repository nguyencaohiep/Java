import java.time.LocalTime;

public class Athlete {
    private String name;
    private String group;
    private Integer endTime;
    private Integer time;
    private String code;
    private Integer v;


    public Athlete(String name, String group, String endTime) {
        String[] tmpName = name.trim().split("\\s+");
        String[] tmpGroup = group.trim().split("\\s+");
        this.name = "";
        this.group = "";
        this.code = "";
        for (String str : tmpGroup) {
            Character character = Character.toUpperCase(str.charAt(0));
            this.group += character + str.substring(1) + " ";
            this.code += character;
        }
        for (String str : tmpName) {
            Character character = Character.toUpperCase(str.charAt(0));
            this.name += character + str.substring(1) + " ";
            this.code += character;
        }
        if (endTime.length() < 5)
            endTime = "0" + endTime;
        this.endTime = LocalTime.parse(endTime).toSecondOfDay();
        this.time = this.endTime - LocalTime.parse("06:00").toSecondOfDay();
        double timeTmp = (double) (this.time / 3600.0);
        this.v = (int) (Math.round(120 / timeTmp));
    }

    public Integer getV() {
        return v;
    }

    public Integer getTime() {
        return time;
    }

    public String toString() {
        return code + " " + name + group + v + " Km/h";
    }
}
