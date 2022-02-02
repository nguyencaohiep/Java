import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> a = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            a.add(sc.nextInt());
        }
        List<Integer> res = new ArrayList<>(a);
        Collections.sort(res);
        for (int t : res) {
            System.out.print(t + " ");
        }
        sc.close();
    }
}
/*
5 6
1 2 3 4 5
3 4 5 6 7 8
 */