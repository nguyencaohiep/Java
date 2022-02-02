import java.util.*;

public class J02020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[k + 1];
        boolean end = false;
        for (int i = 1; i <= k; i++)
            arr[i] = i;
        int cou = 0;
        while (end == false) {
            for (int i = 1; i <= k; i++) {
                System.out.print(arr[i] + " ");
            }
            cou++;
            System.out.println("");
            int i = k;
            while (i > 0 && arr[i] == n - k + i)
                i--;
            if (i == 0) {
                end = true;
            }
            arr[i]++;
            for (int j = i + 1; j <= k; j++)
                arr[j] = arr[i] + j - i;
        }
        System.out.println("Tong cong co " + cou + " to hop");
        sc.close();
    }
}