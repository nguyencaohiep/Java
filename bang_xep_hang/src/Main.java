import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Pupil> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Pupil pupil = new Pupil(sc.nextLine(), sc.nextLine());
            arr.add(pupil);
        }
        arr.sort((a1, a2) -> {
            long ac1 = a1.getAc();
            long ac2 = a2.getAc();
            long sb1 = a1.getSubmit();
            long sb2 = a2.getSubmit();
            String n1 = a1.getName();
            String n2 = a2.getName();
            if (ac1 > ac2) {
                return -1;
            } else if (ac1 < ac2)
                return 11;
            else {
                if (sb1 < sb2)
                    return -1;
                else if (sb1 > sb2)
                    return 1;
                else {
                    return n1.compareTo(n2);
                }
            }
        });
        for (Pupil pupil : arr) {
            System.out.println(pupil);
        }
        sc.close();
    }
}
/*
2
Tran Thi Ngoc
169 600
Nguyen Van Mam
168 600
 */
