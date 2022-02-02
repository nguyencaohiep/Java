package J04010;

import java.util.*;

public class J04010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double lenBC = c.distance(b);
            double lenAC = c.distance(a);
            double lenAB = a.distance(b);
            // System.out.print(lenEdgeAB + " " + lenEdgeAC + " " + lenEdgeBC);
            if ((Math.abs(lenAC - lenBC) >= lenAB) || (Math.abs(lenAC - lenAB) >= lenBC)
                    || (Math.abs(lenBC - lenAB) >= lenAC)) {
                System.out.println("INVALID");
            } else {
                double res = (lenAB + lenAC + lenBC) * (lenAB + lenAC - lenBC) * (lenAC + lenBC - lenAB)
                        * (lenBC + lenAB - lenAC);
                res = (Math.sqrt(res));
                res = (double) (res / 4);
                res = (double) (lenAB * lenAC * lenBC / (4 * res));
                res = res * res * Math.PI;
                System.out.printf("%.3f\n", res);
            }
        }
        sc.close();
    }
}
