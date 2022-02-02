import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Employees> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Employees employees = new Employees(i + 1, sc.nextLine(), Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine()), sc.nextLine());
            arr.add(employees);
        }
        arr.sort(((o1, o2) -> {
            long i1 = o1.getIncome();
            long i2 = o2.getIncome();
            return Long.compare(i1, i2) * -1;
        }));
        for (Employees employees : arr) {
            System.out.println(employees);
        }
        sc.close();
    }
}
/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV
 */
