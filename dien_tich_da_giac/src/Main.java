import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            double res = 0;
            Point[] arr = new Point[m];
            for (int j = 0; j < m; j++) {
                arr[j] = new Point(sc.nextInt(), sc.nextInt());
            }
            int ind = 1;
            while (ind + 1 < m) {
                Triangle triangle = new Triangle(arr[0], arr[ind], arr[ind + 1]);
                res += triangle.getArea();
                ind++;
            }
            String r = String.format("%.3f",res);
            System.out.println(r);
        }
        sc.close();
    }
}
/*
2
3
0 0
1 0
0 1
4
0 0
2 0
2 2
0 2
 */