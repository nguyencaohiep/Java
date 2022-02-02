import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        for(Employees employees : arr){
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
24
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
500
28
 */