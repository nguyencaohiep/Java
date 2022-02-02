import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employees employees = new Employees(1, sc.nextLine(), Long.parseLong(sc.nextLine()),
                Long.parseLong(sc.nextLine()), sc.nextLine());
        System.out.println(employees);
        sc.close();
    }
}
/*
Bui Thi Trang
45000
23
PGD
 */