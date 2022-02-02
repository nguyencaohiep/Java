import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    a[j][k] = sc.nextInt();
                    b[k][j] = a[j][k];
                }
            }
            System.out.println("Test " + (i + 1) + ":");
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int tm = 0;
                    for (int l = 0; l < m; l++) {
                        tm = tm + a[j][l] * b[l][k];
                    }
                    System.out.print(tm + " ");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
