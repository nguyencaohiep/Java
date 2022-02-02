import java.util.Scanner;

public class J02031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int res[][] = new int[n - 1][n];
        for (int i = 0; i < n - 1; i++) {
            int min = arr[i];
            int ind = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    ind = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = tmp;
            for (int j = 0; j < n; j++) {
                res[i][j] = arr[j];
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}