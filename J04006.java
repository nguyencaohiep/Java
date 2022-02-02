import java.util.*;

class Pupil {
    private String id = "B20DCCN001";
    private String fullName;
    private String grade;
    private String dateOfBirth;
    private float score;

    public Pupil(String fullName, String grade, String dateOfBirth, float score) {
        this.fullName = fullName;
        this.grade = grade;
        this.dateOfBirth = dateOfBirth;
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGetDateOfBirth() {
        return dateOfBirth;
    }

    public void setGetDateOfBirth(String getDateOfBirth) {
        this.dateOfBirth = getDateOfBirth;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String display(String fullName, String grade, String dateOfBirth, float score) {
        return String.format("%s %s %s %s %.2f", id, fullName, grade, dateOfBirth, score);
    }
}

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String grade = sc.nextLine();
        String dateOfBirth = sc.nextLine();
        String tmp[] = dateOfBirth.split("/");
        for (int i = 0; i <= 1; i++) {
            if (tmp[i].length() == 1)
                tmp[i] = "0" + tmp[i];
        }
        dateOfBirth = tmp[0] + "/" + tmp[1] + "/" + tmp[2];
        float score = Float.parseFloat(sc.nextLine());
        Pupil pup = new Pupil(fullName, grade, dateOfBirth, score);
        System.out.println(pup.display(fullName, grade, dateOfBirth, score));
        sc.close();
    }
}
