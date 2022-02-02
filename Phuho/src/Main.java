import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Worker> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Worker worker = new Worker(i + 1, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()));
            arr.add(worker);
        }
//        arr.sort((a, b) -> {
//            int s1 = a.getSum();
//            int s2 = b.getSum();
//            return Integer.compare(s1, s2) * -1;
//        });
        for (Worker worker : arr) {
            System.out.println(worker);
        }
        sc.close();
    }
}
/*
3
Doan Thi Kim
13/03/1982
8
9.5
Dinh Thi Ngoc Ha
03/09/1996
6.5
8
Tran Thanh Mai
12/09/2004
8
9
 */