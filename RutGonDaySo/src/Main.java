import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Long> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr.size() == 0) {
                arr.add(sc.nextLong());
            } else {
                Long s1 = arr.get(arr.size() - 1);
                Long s2 = sc.nextLong();
                if ((s1 + s2) % 2 == 0)
                    arr.remove(arr.size() - 1);
                else
                    arr.add(s2);
            }
        }
        System.out.println(arr.size());
        sc.close();
    }

}
/*
5
2 3 4 5 6
10
1 5 5 8 6 4 3 5 9 3
 */