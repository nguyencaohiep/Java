public class Teacher {
    private String id;
    private String name;
    private String code;
    private double score1;
    private double score2;
    private double bonus;
    private String major;
    private double sum;

    public Teacher(int id, String name, String code, double score1, double score2) {
        this.id = String.format("GV%02d", id);
        this.name = name;
        this.code = code;
        String subject = code.substring(0, 1);
        if (subject.equals("A"))
            this.major = "TOAN";
        else if (subject.equals("B"))
            this.major = "LY";
        else
            this.major = "HOA";
        String add = code.substring(1);
        if (add.equals("1"))
            this.bonus = 2.0;
        else if (add.equals("2"))
            this.bonus = 1.5;
        else if (add.equals("3"))
            this.bonus = 1.0;
        else
            this.bonus = 0.0;
        this.score1 = score1;
        this.score2 = score2;
        this.sum = this.score1 * 2 + this.score2 + this.bonus;
    }

    public double getSum() {
        return sum;
    }

    public String toString() {
        String type = "";
        if (sum < 18)
            type = "LOAI";
        else
            type = "TRUNG TUYEN";
        return id + " " + name + " " + major + " " + String.format("%.1f", sum) + " " + type;
    }
}
