import java.util.*;

public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ucln = gcd(a, b);
            System.out.println(((a * b) / ucln) + " " + ucln);
        }
        sc.close();
    }

    static long gcd(long a, long b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }
}
