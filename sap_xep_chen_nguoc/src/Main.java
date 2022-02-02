import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<List> a = new ArrayList<>();
        Vector<Integer> vec = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            vec.add(arr[i]);
            Collections.sort(vec);
            List<Integer> tmp = new ArrayList<>(vec);
            a.add(tmp);
        }
        for (int i = a.size() - 1; i >= 0; i--) {
            System.out.print("Buoc " + i + ": ");
            int len = a.get(i).size();
            for (int j = 0; j < len - 1; j++) {
                System.out.print(a.get(i).get(j) + " ");
            }
            System.out.println(a.get(i).get(len -1));
        }
        sc.close();
    }
}
/*
6
5 8 3 9 1 4
 */