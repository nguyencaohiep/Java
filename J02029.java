import java.util.*;

public class J02029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            ArrayList<String> res = new ArrayList<String>();
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
                String tmp = "";
                for (int m = 0; m < n; m++)
                    tmp += arr[m] + " ";
                res.add(tmp);
            }
            for (int i = res.size() - 1; i >= 0; i--) {
                System.out.print("Buoc " + (i + 1) + ": ");
                System.out.println(res.get(i));
            }
        }
        sc.close();
    }
}
