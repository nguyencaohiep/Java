import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
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
