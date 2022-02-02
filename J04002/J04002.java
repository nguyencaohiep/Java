package J04002;

import java.util.*;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange rec1 = new Rectange(sc.nextInt(), sc.nextInt(), sc.next());
        if (rec1.getHeight() > 0 && rec1.getWidth() > 0) {
            System.out.println((int) (rec1.findPerimeter()) + " " + (int) (rec1.findArea()) + " " + rec1.getColor());
        } else {
            System.out.println("INVALID");
        }
        sc.close();
    }
}
