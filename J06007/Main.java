import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        MonHoc[] mhs = new MonHoc[n];
        for (int i = 0; i < n; i++) {
            mhs[i] = new MonHoc(scanner.nextLine());
        }

        n = Integer.parseInt(scanner.nextLine());
        GiangVien[] gvs = new GiangVien[n];
        for (int i = 0; i < n; i++) {
            gvs[i] = new GiangVien(scanner.nextLine());
        }

        n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String ma = scanner.next();
            scanner.next();
            for (int j = 0; j < n; j++) {
                if (ma.equals(gvs[j].getMa())) {
                    gvs[j].updateGio(Double.parseDouble(scanner.next()));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(gvs[i]);
        }
    }
}

class MonHoc {
    private String ten, ma;

    public MonHoc(String data) {
        String[] arr = data.trim().split("\\s+");
        this.ma = arr[0];
        this.ten = "";
        for (int i = 1; i < arr.length; i++) {
            this.ten += arr[i] + " ";
        }
    }
}

class GiangVien {
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

/**
2
INT1155 Tin hoc co so 2
INT1306 Cau truc du lieu va giai thuat
2
GV01 Nguyen Van An
GV02 Hoang Binh Minh
2
GV01 INT1155 113.2
GV02 INT1306 126.72
 */