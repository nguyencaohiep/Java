import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo tmp = a.cong(b);
            tmp.rutGon();
            tmp = tmp.nhan(tmp);
            tmp.rutGon();
            System.out.print(tmp + " ");
            PhanSo t = a.nhan(b).nhan(tmp);
            t.rutGon();
            System.out.println(t);
        }
        sc.close();

    }
}
