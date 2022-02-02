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
        long sum = 0;
        for (Employees employees : arr) {
            System.out.println(employees);
            sum += employees.getIncome();
        }
        System.out.println("Tong chi phi tien luong: " + sum);
        sc.close();
    }
}
/*
5
Cao Van Vu
50000
26
GD
Bui Thi Trang
45000
23
PGD
Do Van Truong
40000
25
PGD
Nguyen Van Cam
37000
26
TP
Truong Thi Tu Linh
45000
22
NV
 */
