public class Worker {
    private String id;
    private String name;
    private String dateBirth;
    private double sc1;
    private double sc2;
    private int sum;

    public Worker(int id, String name, String dateBirth, double sc1, double sc2) {
        this.id = String.format("PH%02d", id);
        this.name = name;
        this.dateBirth = dateBirth;
        this.sc1 = sc1;
        this.sc2 = sc2;
        double t = (sc1 + sc2) / 2 + bonus(sc1, sc2);
        String tmp = Double.toString(t);
        int ind = tmp.indexOf('.');
        if (Integer.parseInt(tmp.substring(ind + 1, ind + 2)) >= 5)
            this.sum = Integer.parseInt(tmp.substring(0, ind)) + 1;
        else
            this.sum = Integer.parseInt(tmp.substring(0, ind));
        if(this.sum > 10)
            this.sum = 10;
    }

    public double bonus(double sc1, double sc2) {
        if (sc1 >= 8 && sc2 >= 8)
            return 1;
        else if (sc1 >= 7.5 && sc2 >= 7.5)
            return 0.5;
        else
            return 0;
    }

    public int getSum(){
        return sum;
    }

    public String getRes() {
        int tmp = this.sum;
        if (tmp < 5)
            return "Truot";
        else if (tmp == 6 || tmp == 5)
            return "Trung binh";
        else if (tmp == 7)
            return "Kha";
        else if (tmp == 8)
            return "Gioi";
        else
            return "Xuat sac";
    }

    public String toString() {
        int len = dateBirth.length();
        int age = 2021 - Integer.parseInt(this.dateBirth.substring(len - 4));
        return id + " " + name + " " + age + " " + sum + " " + getRes();
    }
}
