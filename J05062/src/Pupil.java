public class Pupil {
    private String name;
    private double mediumScore;
    private int trainingScore;
    private String type;

    public Pupil(String name, double mediumScore, int trainingScore) {
        this.name = name;
        this.mediumScore = mediumScore;
        this.trainingScore = trainingScore;

    }

    public double getMediumScore() {
        return mediumScore;
    }

    public String getType(double score) {
        if (mediumScore < score)
            this.type = "KHONG";
        else {
            if (mediumScore >= 3.6 && trainingScore >= 90)
                this.type = "XUATSAC";
            else if (mediumScore >= 3.2 && trainingScore >= 80)
                this.type = "GIOI";
            else if (mediumScore >= 2.5 && trainingScore >= 70)
                this.type = "KHA";
            else
                this.type = "KHONG";
        }
        return this.type;
    }

    public String toString() {
        return name + ": ";
    }

}
