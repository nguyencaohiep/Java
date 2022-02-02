import java.util.*;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        boolean end = false;
        for (int i = 0; i < n; i++) {
            end = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    end = true;
                }
            }
            if (!end) {
                break;
            } else {
                System.out.print("Buoc " + (i + 1) + ": ");
                for (int t = 0; t < n; t++) {
                    System.out.print(arr[t]+" ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
