import java.util.Locale;

public class Teacher {
    private String id;
    private String name;
    private String subject;
    private String encode;

    public Teacher(int id, String name, String subject) {
        this.id = String.format("GV%02d", id);
        this.name = name;
        this.subject = subject;
        String tmp[] = subject.trim().split("\\s+");
        String department = "";
        for (String t : tmp) {
            department += Character.toUpperCase(t.charAt(0));
        }
        this.encode = department;
    }

    public String getEncode() {
        return encode;
    }

    public String toString() {
        return id + " " + name + " " + encode;
    }
}


