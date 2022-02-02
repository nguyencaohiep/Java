public class Pupil {
    private String id;
    private String name;
    private String cl;
    private double score1;
    private double score2;
    private double score3;

    public Pupil(String id, String name, String cl, double score1, double score2, double score3) {
        this.id = id;
        this.name = name.trim().replaceAll("\\s+", " ");
        this.cl = cl;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " " + name + " " + cl + " " + score1 + " " + score2 + " " + score3;
    }
}


