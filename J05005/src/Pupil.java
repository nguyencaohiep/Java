import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Pupil implements Comparable<Pupil>{
    private int id;
    private String fullName;
    private Date dateOfBirth;
    private String grade;
    private float gpa;

    public Pupil(int id, String fullName, String dateOfBirth, String grade, float gpa) throws ParseException {
        this.id = id;
        this.fullName = fullName.trim().toLowerCase();
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        this.grade = grade.trim();
        this.gpa = gpa;
    }
    public Pupil() {
        this.id = 0;
        this.fullName = "";
        this.dateOfBirth = null;
        this.grade = "";
        this.gpa = 0;
    }
    @Override
    public int compareTo(Pupil o) {
        Float a = o.gpa;
        Float b = this.gpa;
        return a.compareTo(b);
    }
    public String toString() {
        StringBuilder tmp = new StringBuilder(Integer.toString(id));
        for (int i = 0; i < 4 - tmp.length(); i++) {
            tmp.insert(0, "0");
        }
        tmp.insert(0, "B20DCCN");
        String[] arr = fullName.trim().split("\\s+");
        StringBuilder name = new StringBuilder();
        for (String s : arr) {
            name.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String date = formatter.format(dateOfBirth);
        return String.format("%s %s%s %s %.2f", tmp.toString(), name.toString(), grade, date, gpa);
    }

}
