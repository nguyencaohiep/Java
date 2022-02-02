import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n - 1; i++) {
            int t1 = sc.nextInt();
            a[t1]++;
            int t2 = sc.nextInt();
            a[t2]++;
        }
        if (check(a))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();

    }

    public static boolean check(int[] a) {
        Arrays.sort(a);
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != 1)
                return false;
        }
        return true;
    }
}
