public class Test {
    private String id;
    private String name;
    private double score1;
    private double score2;
    private String type;
    private double medium;

    public Test(int id, String name, double score1, double score2) {
        this.id = String.format("TS%02d", id);
        this.name = name.trim().replaceAll("\\s+", " ");
        if (score1 > 10)
            score1 /= 10.0;
        if (score2 > 10)
            score2 /= 10.0;
        this.score1 = score1;
        this.score2 = score2;
        this.medium = (score1 + score2) / 2;
        if (medium < 5)
            this.type = "TRUOT";
        else if (medium < 8)
            this.type = "CAN NHAC";
        else if (medium > 9.5)
            this.type = "XUAT SAC";
        else
            this.type = "DAT";
    }

    public double getMediumScore() {
        return medium;
    }

    public String toString() {
        return id + " " + name + " " + String.format("%.2f", medium) + " " + type;
    }
}
