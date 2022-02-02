public class Teacher implements Comparable<Teacher> {
    private String ma;
    private String ten;
    private String maXetTuyen;
    private double diem1;
    private double diem2;

    public Teacher(String ma, String ten, String maXetTuyen, double diem1, double diem2) {
        this.ma = ma;
        this.ten = ten;
        this.maXetTuyen = maXetTuyen;
        this.diem1 = diem1;
        this.diem2 = diem2;
    }

    public Double tinhDiem() {
        String maUuTien = this.maXetTuyen.charAt(1) + "";
        if (maUuTien.equals("1")) {
            return this.diem1 * 2 + this.diem2 + 2.0;
        } else if (maUuTien.equals("2")) {
            return this.diem1 * 2 + this.diem2 + 1.5;
        } else if (maUuTien.equals("3")) {
            return this.diem1 * 2 + this.diem2 + 1.0;
        }
        return this.diem1 * 2 + this.diem2;
    }

    public String monHoc() {
        String maMon = this.maXetTuyen.charAt(0) + "";
        if (maMon.equals("A")) {
            return "TOAN";
        } else if (maMon.equals("B")) {
            return "LY";
        }
        return "HOA";
    }

    public String toString() {
        String res = "";
        double tmp = tinhDiem();
        if (tmp >= 18.0) {
            res = String.format("%.1f", tmp) + "TRUNG TUYEN";
        } else {
            res = String.format("%.1f", tmp) + "LOAI";
        }
        return ma + " " + ten + " " + monHoc() + " " + " " + res;
    }

    public int compareTo(Teacher o) {
        return -1 * this.tinhDiem().compareTo(o.tinhDiem());
    }
}
