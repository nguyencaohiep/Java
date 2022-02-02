public class Pupil {
    private String name;
    private double score;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = "HS" + id;
    }

    public String toString() {
        return String.format("%s %s %.1f ", id, name, Math.round(score * 10) / 10.0);
    }
}
