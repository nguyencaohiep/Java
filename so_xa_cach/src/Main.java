import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            int[] a = new int[10];
            int n = in.nextInt();

            init(a, n);
            while (check(a, n)) {
                gen(a, n);
                if (check2(a, n))
                    pri(a, n);
            }
        }
        in.close();
    }

    public static void init(int[] a, int n) {
        for (int i = 1; i <= n; i++)
            a[i] = i;
    }

    public static boolean check(int[] a, int n) {
        for (int i = 1; i <= n; i++) {
            if (a[i] != n + 1 - i)
                return true;
        }
        return false;
    }

    public static boolean check2(int[] a, int n) {
        for (int i = 1; i < n; i++)
            if (Math.abs(a[i] - a[i + 1]) == 1)
                return false;
        return true;
    }

    public static void gen(int[] a, int n) {
        int j = n;
        while (a[j] < a[j - 1])
            j--;

        for (int i = n; i >= j; i--) {
            if (a[i] > a[j - 1]) {
                int x = a[i];
                a[i] = a[j - 1];
                a[j - 1] = x;
                break;
            }
        }
        int l = j, r = n;
        while (l < r) {
            int tmp = a[l];
            a[l] = a[r];
            a[r] = tmp;
            l++;
            r--;
        }
    }

    public static void pri(int[] a, int k) {
        for (int i = 1; i <= k; i++)
            System.out.print(a[i]);
        System.out.println();
    }

}
