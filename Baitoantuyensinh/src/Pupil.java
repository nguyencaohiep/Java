public class Pupil {
    private String id;
    private String name;
    private double sc1;
    private double sc2;
    private double sc3;
    private double sum;


    public Pupil(String id, String name, double sc1, double sc2, double sc3) {
        this.id = id;
        this.name = name;
        this.sc1 = sc1;
        this.sc2 = sc2;
        this.sc3 = sc3;
        this.sum = sc1 * 2 + sc2 + sc3 + Double.parseDouble(bonus());
    }

    public double getSum() {
        return sum;
    }

    public String bonus() {
        String tmp = this.id.substring(0, 3);
        if (tmp.equals("KV1"))
            return "0.5";
        else if (tmp.equals("KV2"))
            return "1";
        else
            return "2.5";
    }

    public String getRes() {
        if (sum >= 24)
            return "TRUNG TUYEN";
        else
            return "TRUOT";
    }

    public String toString() {
        String s = Double.toString(sum);
        if (s.charAt(s.length() - 1) == '0')
            s = s.substring(0, s.length() - 2);
        return id + " " + name + " " + bonus() + " " + s;
    }
}
