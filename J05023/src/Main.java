import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pupil> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(pupil);
        }
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String year = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + year + ":");
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j).getYear().equals(year))
                    System.out.println(arr.get(j));
            }
        }
        sc.close();
    }
}
/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT02-B
sv4@stu.ptit.edu.vn
1
2015
 */