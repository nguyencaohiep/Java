public class Pupil {
    private String name;
    private double score;
    private String id;
    private String type;

    public Pupil(int id, String name, double score) {
        this.id = String.format("HS%02d",id);
        this.name = name.trim().replaceAll("\\s+", " ");
        this.score = score;
        if (score < 5)
            this.type = "Yeu";
        else if (score < 7)
            this.type = "Trung Binh";
        else if (score < 9)
            this.type = "Kha";
        else
            this.type = "Gioi";
    }

    public double getScore() {
        return score;
    }

    public String toString() {
        return id + " " + name + " " + score + " " + type + " ";
    }

}

