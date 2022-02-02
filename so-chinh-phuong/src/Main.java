import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int a = Integer.parseInt(sc.nextLine());
            int tmp = (int) Math.sqrt((double) (a));
            if (tmp * tmp == a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t -= 1;
        }
        sc.close();
    }
}
/*
3
11
121
361
 */