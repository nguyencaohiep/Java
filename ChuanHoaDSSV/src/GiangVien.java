public class GiangVien {
    private String ten, ma;
    private double gio;

    public GiangVien(String data) {
        String[] arr = data.trim().split("\\s+");
        this.ma = arr[0];
        this.ten = "";
        for (int i = 1; i < arr.length; i++) {
            this.ten += arr[i] + " ";
        }
        this.gio = 0;
    }

    public void updateGio(double gio) {
        this.gio += gio;
    }

    public String getMa() {
        return ma;
    }

    public String toString() {
        return ten + String.format("%.2f", gio);
    }
}
