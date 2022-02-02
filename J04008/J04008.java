package J04008;

import java.util.*;

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double lenEdgeBC = c.distance(b);
            double lenEdgeAC = c.distance(a);
            double lenEdgeAB = a.distance(b);
            // System.out.print(lenEdgeAB + " " + lenEdgeAC + " " + lenEdgeBC);
            if ((Math.abs(lenEdgeAC - lenEdgeBC) >= lenEdgeAB) || (Math.abs(lenEdgeAC - lenEdgeAB) >= lenEdgeBC)
                    || (Math.abs(lenEdgeBC - lenEdgeAB) >= lenEdgeAC)) {
                System.out.println("INVALID");
            } else {
                double res = lenEdgeAC + lenEdgeAB + lenEdgeBC;
                // System.out.print(res);
                res = (double) Math.round(res * 1000) / 1000;
                String s = Double.toString(res);
                String tmp = s.substring(s.indexOf("."));
                for (int i = 0; i < 4 - tmp.length(); i++) {
                    s += "0";
                }
                System.out.println(s);
            }
        }
        sc.close();
    }
}
