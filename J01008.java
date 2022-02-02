import java.util.*;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int j = 1;
        while (j <= t) {
            long n = sc.nextLong();
            System.out.print("Test " + j + ": ");
            for (long i = 2; i <= n; i++) {
                int cou = 0;
                while (n % i == 0) {
                    cou++;
                    n /= i;
                }
                if (cou > 0) {
                    System.out.print(i + "(" + cou + ") ");
                }
            }
            System.out.println("");
            j++;
        }
        sc.close();
    }
}
