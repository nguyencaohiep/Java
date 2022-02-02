import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pupil> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            if (id.equals(""))
                break;
            String fullName = sc.nextLine();
            String cl = sc.nextLine();
            String email = sc.nextLine();
            Pupil tmp = new Pupil(id, fullName, cl, email);
            arr.add(tmp);
        }
        arr.sort(((o1, o2) -> o1.getId().compareTo(o2.getId())));
        for (Pupil tmp : arr) {
            System.out.println(tmp);
        }
        sc.close();
    }
}
/*
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
D15CQKT03-B
sv4@stu.ptit.edu.vn
 */
