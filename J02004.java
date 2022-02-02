import java.util.*;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean result = true;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            for (int i = 0; i < n / 2; i++)
                if (arr[i] != arr[n - 1 - i]) {
                    result = false;
                    break;
                }
            if (result == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
