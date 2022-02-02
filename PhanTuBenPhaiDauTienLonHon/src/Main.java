import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            long[] arr = new long[m];
            for (int j = 0; j < m; j++) {
                arr[j] = Long.parseLong(sc.next());
            }
            for (int j = 0; j < m; j++) {
                boolean have = false;
                for (int k = j + 1; k < m ; k++) {
                    if (arr[k] > arr[j]) {
                        System.out.print(arr[k] + " ");
                        have = true;
                        break;
                    }
                }
                if (!have) {
                    System.out.print("-1 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
