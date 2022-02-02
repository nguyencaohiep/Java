import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static int[] tmp = new int[15];
    public static int n, m;
//    private static int[] prime = new int[1400];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//        prime[0] = prime[1] = 1;
//        for (int i = 2; i < 1400; i++) {
//            if (prime[i] == 0)
//                for (int j = 2 * i; j < 1400; j += i)
//                    prime[j] = 1;
//        }
        for (int i = 0; i < n; i++) {
            m = sc.nextInt();
            Integer[] arr = new Integer[m];
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr, Collections.reverseOrder());
            solve(arr, 0);
        }
        sc.close();
    }

    public static void solve(Integer[] a, int i) {
        for (int j = 0; j < 2; j++) {
            tmp[i] = j;
            if (i == m - 1) {
                if (check(a))
                    display(a);
            } else {
                solve(a, i + 1);
            }
        }
    }

    public static boolean check(Integer[] a) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (tmp[i] == 1)
                sum += a[i];
        }
        return sum % 2 == 1;
    }

    public static void display(Integer[] a) {
        for (int i = 0; i < m; i++) {
            if (tmp[i] == 1)
                System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

}
/*
1
4
3 2 5 4
 */
