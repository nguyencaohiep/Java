import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Bill> arr = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Bill bill = new Bill(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            arr.add(bill);
        }
        arr.sort((a, b) -> {
            long m1 = a.getMoney();
            long m2 = b.getMoney();
            if (m1 > m2)
                return -1;
            else if (m1 < m2)
                return 1;
            else return 0;
        });
        for (Bill bill : arr) {
            System.out.println(bill);
        }
        sc.close();
    }
}
/*
3
ML01
May lanh SANYO
12
4000000
2400000
ML02
May lanh HITACHI
4
2550000000
0
ML03
May lanh NATIONAL
5
3000000
150000
 */
