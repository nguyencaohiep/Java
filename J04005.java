import java.util.*;

class Examinee {
    private String fullName;
    private String dateOfBirth;
    private float score1;
    private float score2;
    private float score3;

    public Examinee(String fullName, String dateOfBirth, float score1, float score2, float score3) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
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

    public float getScore1() {
        return score1;
    }

    public void setScore1(float score1) {
        this.score1 = score1;
    }

    public float getScore2() {
        return score2;
    }

    public void setScore2(float score2) {
        this.score2 = score2;
    }

    public float getScore3() {
        return score3;
    }

    public void setScore3(float score3) {
        this.score3 = score3;
    }

    public String display(String fullName, String dateOfBirth,float score1, float score2,float score3) {
            float sum = score1 + score2 + score3;
            return String.format("%s %s %.1f", fullName, dateOfBirth, sum);
    }
}

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String dateOfBirth = sc.nextLine();
        float score1 = Float.parseFloat(sc.nextLine());
        float score2 = Float.parseFloat(sc.nextLine());
        float score3 = Float.parseFloat(sc.nextLine());
        Examinee ex = new Examinee(fullName, dateOfBirth, score1, score2, score3);
        System.out.println(ex.display(fullName, dateOfBirth, score1, score2, score3));
        sc.close();
    }
}
