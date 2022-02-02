public class Pupil {
    private int id;
    private String name;
    private String dateBirth;
    private float sc1;
    private float sc2;
    private float sc3;

    public Pupil(int id, String name, String dateBirth, float sc1, float sc2, float sc3) {
        this.id = id;
        this.name = name;
        this.dateBirth = dateBirth;
        this.sc1 = sc1;
        this.sc2 = sc2;
        this.sc3 = sc3;
    }

    public float getSum() {
        return sc1 + sc2 + sc3;
    }

    public String toString() {
        return id + " " + name + " " + dateBirth + " " + getSum();
    }
}
