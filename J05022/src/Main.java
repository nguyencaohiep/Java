import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pupil> arr = new ArrayList<Pupil>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil();
            pupil.setId(sc.nextLine());
            pupil.setName(sc.nextLine());
            pupil.setCl(sc.nextLine());
            pupil.setEmail(sc.nextLine());
            arr.add(pupil);
        }
        arr.sort(((o1,o2) -> o1.getCl().compareTo(o2.getCl())));
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String cla = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + cla + ":");
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j).getCl().equals(cla)) {
                    System.out.println(arr.get(j));
                }
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
D15CQKT02-B
 */
