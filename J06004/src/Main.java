import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        String[] input = sc.nextLine().split("\\s+");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        List<Pupil> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arr.add(pupil);
        }
        arr.sort(((o1, o2) -> o1.getId().compareTo(o2.getId())));
        String[] listTopic = new String[m];
        for (int i = 0; i < m; i++) {
            listTopic[i] = sc.nextLine().trim();
        }
        for (Pupil pupil : arr) {
            System.out.println(pupil + " " + listTopic[pupil.getGroupNumber() - 1]);
        }
        sc.close();
    }
}
/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN01
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
 */