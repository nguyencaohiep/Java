import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Long> arr = new ArrayList<>();
        arr.add(0L);
        arr.add(1L);
        for (int j = 2; j <= 92; j++) {
            int len1 = arr.size();
            arr.add(arr.get(len1 - 1) + arr.get(len1 - 2));
        }
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            if(arr.contains(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
