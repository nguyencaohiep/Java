package J04001;

import java.util.*;

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            double res = (p1.distance(p2));
            res = (double) Math.round(res * 10000) / 10000;
            String s = Double.toString(res);
            String tmp = s.substring(s.indexOf("."));
            for (int i = 0; i < 5 - tmp.length(); i++){
                s += "0";
            }
            System.out.println(s);
        }
        sc.close();
    }
}
