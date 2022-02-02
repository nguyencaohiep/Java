import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pupil> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(pupil);
        }
        arr.sort((o1,o2) -> o1.getId().compareTo(o2.getId()));
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String company = sc.nextLine();
            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(j).getCompany().equals(company))
                    System.out.println(arr.get(j));
            }
        }
        sc.close();
    }
}
/*
6
B17DCCN016
Le Khac Tuan Anh
D17HTTT2
test1@stu.ptit.edu.vn
VIETTEL
B17DCCN107
Dao Thanh Dat
D17CNPM5
test2@stu.ptit.edu.vn
FPT
B17DCAT092
Cao Danh Huy
D17CQAT04-B
test3@stu.ptit.edu.vn
FPT
B17DCCN388
Cao Sy Hai Long
D17CNPM2
test4@stu.ptit.edu.vn
VNPT
B17DCCN461
Dinh Quang Nghia
D17CNPM2
test5@stu.ptit.edu.vn
FPT
B17DCCN554
Bui Xuan Thai
D17CNPM1
test6@stu.ptit.edu.vn
GAMELOFT
1
FPT
 */
