import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Employees> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Employees employees = new Employees(i + 1, scanner.nextLine(), scanner.nextLine(),
                    Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
            arr.add(employees);
        }
        arr.sort((o1, o2) -> {
            if (o1.getIncome() == o2.getIncome())
                return o1.getId().compareTo(o2.getId());
            else if (o1.getIncome() < o2.getIncome())
                return 1;
            else
                return -1;
        });
        for (Employees employees : arr) {
            System.out.println(employees);
        }
        scanner.close();
    }
}
/*
4
Tran Thi Yen
NV
1000
30
Nguyen Van Thanh
BV
1000
30
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
TP
 */