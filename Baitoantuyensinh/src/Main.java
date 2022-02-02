import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pupil> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            arr.add(pupil);
        }
        arr.sort(((o1, o2) -> {
            double s1 = o1.getSum();
            double s2 = o2.getSum();
            return Double.compare(s2, s1);
        }));
        for (Pupil pupil : arr) {
            System.out.println(pupil + " " + pupil.getRes());
        }
        sc.close();
    }
}
/*
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6.5
7
 */