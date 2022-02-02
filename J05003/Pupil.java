package J05003;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Pupil {
    private int id;
    private String fullName;
    private String grade;
    private Date dateOfBirth;
    private float gpa;

    public Pupil(Integer id, String fullName, String grade, String dateOfBirth, float gpa) throws ParseException {
        this.id = id;
        this.fullName = fullName;
        this.grade = grade;
        Date tmp = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        this.dateOfBirth = tmp;
        this.gpa = gpa;
    }

    public Pupil() {
        this.id = 0;
        this.fullName = "";
        this.grade = "";
        this.dateOfBirth = null;
        this.gpa = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        String tmp = Integer.toString(id);
        for (int i = 0; i < 4 - tmp.length(); i++) {
            tmp = "0" + tmp;
        }
        tmp = "B20DCCN" + tmp;
        SimpleDateFormat fomatter = new SimpleDateFormat("dd/MM/yyyy");
        String date = fomatter.format(this.dateOfBirth);
        return String.format("%s %s %s %s %.2f", tmp, fullName, grade, date, gpa);
    }
}
