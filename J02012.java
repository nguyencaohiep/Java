import java.util.*;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Vector<Integer> vec = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            vec.add(arr[i]);
            Collections.sort(vec);
            System.out.print("Buoc " + i + ": ");
            for (int t : vec) {
                System.out.print(t + " ");
            }
            System.out.println("");
        }
        sc.close();
    }

}
