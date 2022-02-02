import java.util.*;

public class J02032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            boolean end = false;
            ArrayList<String> res = new ArrayList<String>();
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
                    String tmp = "";
                    for (int m = 0; m < n; m++)
                        tmp += arr[m] + " ";
                    res.add(tmp);
                }
            }
            for (int i = res.size() - 1; i >= 0; i--) {
                System.out.print("Buoc " + (i + 1) + ": ");
                System.out.println(res.get(i));
            }
        }
        sc.close();
    }
}
