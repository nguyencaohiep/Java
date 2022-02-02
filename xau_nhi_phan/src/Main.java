import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            long k = sc.nextLong();
            long[] tmp = new long[93];
            tmp[1] = tmp[2] = 1;
            for (int j = 3; j < 93; j++) {
                tmp[j] = tmp[j - 2] + tmp[j - 1];
            }
            System.out.println(solve(m, k, tmp));
        }
        sc.close();
    }

    public static int solve(int m, long k, long[] a) {
        if (m == 1)
            return 0;
        if (m == 2)
            return 1;
        if (k > a[m - 2])
            return solve(m - 1, k - a[m - 2], a);
        else
            return solve(m - 2, k, a);
    }
}
