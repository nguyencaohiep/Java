import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str1 = sc.nextLine();
            String arr1[] = str1.split(" ");
            Arrays.sort(arr1);
            String str2 = sc.nextLine();
            String arr2[] = str2.split(" ");
            Arrays.sort(arr2);
            HashMap<String, Integer> hs = new HashMap<String, Integer>();
            for (int i = 0; i < arr1.length; i++) {
                hs.put(arr1[i], i);
            }
            for (Map.Entry<String, Integer> ele : hs.entrySet()) {
                String tmp = (String) ele.getKey();
                if (check(arr2, tmp) == true) {
                    System.out.print(tmp + " ");
                }
            }
            System.out.println("");
        }
        sc.close();
    }

    static boolean check(String[] arr, String str) {
        for (String tmp : arr)
            if (tmp.equals(str))
                return false;
        return true;
    }

}
