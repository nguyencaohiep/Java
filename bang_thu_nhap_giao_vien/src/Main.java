import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ht = 0;
        int hp = 0;
        int n = Integer.parseInt(sc.nextLine());
        List<Teacher> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            long bS = Long.parseLong(sc.nextLine());
            String role = id.substring(0, 2);
            Teacher teacher = new Teacher(id, name, bS);
            if (role.equals("HT") && ht < 1) {
                arr.add(teacher);
                ht++;
            }
            if (role.equals("HP") && hp < 2) {
                arr.add(teacher);
                hp++;
            }
            if (role.equals("GV")) {
                arr.add(teacher);
            }
        }
        for (Teacher teacher : arr) {
            System.out.println(teacher);
        }
        sc.close();
    }
}
/*
4
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
HT06
Hoang Thanh Tu
1770000
GV02
Tran Binh Nguyen
1468000
 */