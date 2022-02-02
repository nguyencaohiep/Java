import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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