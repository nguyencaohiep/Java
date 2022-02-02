import java.util.Locale;

public class Teacher {
    private int id;
    private String name;
    private String subject;

    public Teacher(int i, String name, String subject) {
        this.id = i;
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name.toLowerCase();
    }

    public String toString() {
        String tmp[] = subject.split(" ");
        String department = "";
        for (String t : tmp) {
            department += Character.toUpperCase(t.charAt(0));
        }
        return String.format("GV%02d", id) + " " + name + " " + department;
    }
}
