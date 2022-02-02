import java.util.*;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextDouble();
            double m = 1;
            double h = sc.nextDouble();
            double s = ((double) (1) / (double) (2)) * h;
            while (m < n) {
                double tmp = (double) (m) / (double) (n);
                double result = (double) ((tmp * 2 * s) / Math.sqrt(tmp));
                System.out.printf("%.6f", result);
                System.out.print(" ");
                m++;
            }
            System.out.println("");
        }
        sc.close();
    }
}
