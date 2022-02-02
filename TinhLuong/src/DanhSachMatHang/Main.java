package DanhSachMatHang;

import DanhSachMatHang.Department;
import DanhSachMatHang.Employee;

import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Department> hsD = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\s+");
            String tmp = "";
            for (int j = 1; j < line.length; j++) {
                tmp += line[j] + " ";
            }
            hsD.put(line[0], new Department(line[0], tmp.trim()));
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String id = sc.nextLine();
            Employee em = new Employee(id, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            Department de = hsD.get(id.substring(3));
            System.out.println(em + " " + de + " " + em.getSalary());
        }
        sc.close();
    }
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
 */


