import java.util.*;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine().trim().toLowerCase();
            String arr[] = str.split("\\s+");
            StringBuilder result = new StringBuilder();
            for (int i = 1; i < arr.length; i++) {
                result.append(Character.toUpperCase(arr[i].charAt(0)));
                for (int j = 1; j < arr[i].length(); j++) {
                    result.append(arr[i].charAt(j));
                }
                result.append(" ");
            }
            result.deleteCharAt(result.length() - 1);
            result.append(", ");
            for (int j = 0; j < arr[0].length(); j++) {
                result.append(Character.toUpperCase(arr[0].charAt(j)));
            }
            System.out.println(result);
        }
        sc.close();
    }
}