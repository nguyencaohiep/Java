import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            long k = sc.nextLong();
            boolean haveZero = false;
            long sum = 0;
            int l = 0;
            boolean have = false;
            int[] a = new int[m];
            for (int j = 0; j < m; j++) {
                a[j] = sc.nextInt();
                if (a[j] == 0)
                    haveZero = true;
                sum += a[j];
                while (sum > k) {
                    sum -= a[l];
                    l++;
                }
                if (sum == k) {
                    have = true;
                }
            }
            if (!have || (haveZero == false && k == 0))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        sc.close();
    }
}
/*
3
6 33
1 4 20 3 10 5
7 7
1 4 0 0 3 10 5
2 0
1 4
 */
