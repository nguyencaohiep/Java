import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Teacher> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Teacher teacher = new Teacher(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()));
            arr.add(teacher);
        }
        arr.sort((a, b) -> {
            double s1 = a.getSum();
            double s2 = b.getSum();
            if (s1 > s2)
                return -1;
            else if (s1 < s2)
                return 1;
            else
                return 0;
        });
        for (Teacher teacher : arr) {
            System.out.println(teacher);
        }
        sc.close();
    }
}
/*
3
Le Van Binh
A1
7.0
3.0
Tran Van Toan
B3
4.0
7.0
Hoang Thi Tam
C2
7.0
6.0
 */