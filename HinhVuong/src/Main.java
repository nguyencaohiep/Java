import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int xmin = Math.min(x1,Math.min(Math.min(x2,x3),x4));
        int xmax = Math.max(x1,Math.max(Math.max(x2,x3),x4));
        int ymin = Math.min(y1,Math.min(Math.min(y2,y3),y4));
        int ymax = Math.max(y1,Math.max(Math.max(y2,y3),y4));
        int d = Math.max(Math.abs(xmax - xmin), Math.abs(ymax - ymin));
        System.out.println(d * d);
        sc.close();
    }
}
