import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 0; i < n; i++) {
            long m = sc.nextLong();
            long t = m;
            if (t == 0) {
                System.out.println("Impossible");
                continue;
            }
            int[] cou = new int[10];
            int k = 1;
            while (!check(cou)) {
                long s = t;
                while (s > 0) {
                    cou[(int) (s % 10)]++;
                    s /= 10;
                }
                k++;
                t = k * m;
            }
            long result = (k - 1) * m;
            System.out.println(result);
        }

        sc.close();
    }

    static boolean check(int[] cou) {
        for (int i = 0; i < 10; i++) {
            if (cou[i] == 0)
                return false;
        }
        return true;
    }
}
/*
5
0
1
2
11
1692
 */
