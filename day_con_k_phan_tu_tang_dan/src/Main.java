import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int[] tmp = new int[15];
    public static int t, n, k;
    public static List<Integer> kq = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            k = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            solve(arr, 0);
        }
        sc.close();
    }

    public static void solve(Integer[] a, int i) {
        for (int j = 1; j >= 0; j--) {
            tmp[i] = j;
            if (i == n - 1) {
                int cou = 0;
                for (int l = 0; l < n; l++) {
                    if (tmp[l] == 1)
                        cou++;
                }
                if (cou == k)
                        display(a);
            } else {
                solve(a, i + 1);
            }
        }
    }

    public static void display(Integer[] a) {
        for (int i = 0; i < n; i++) {
            if (tmp[i] == 1)
                System.out.print(a[i] +" ");
        }
        System.out.println("");
    }
}
/*
1
4 3
3 2 5 4
 */
