import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            if (a.contains(tmp) && !b.contains(tmp))
                b.add(tmp);
        }
        Collections.sort(b);
        for (Integer tmp : b)
            System.out.print(tmp + " ");
        sc.close();
    }
}
/*
5 6
1 2 3 4 5
3 5 4 6 7 8
 */