import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int[][] a = new int[100][100];
        while (t > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                    if (i % 2 == 0)
                        System.out.print(a[i][j] + " ");
                }
                if (i % 2 == 1) {
                    for (int j = n - 1; j >= 0; j--) {
                        System.out.print(a[i][j] + " ");
                    }
                }
            }
            System.out.println("");
            t--;
        }
        sc.close();
    }
}
