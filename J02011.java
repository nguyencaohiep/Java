import java.util.*;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
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
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n - 1; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println(arr[n - 1]);
        }
        sc.close();
    }
}
