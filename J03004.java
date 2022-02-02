import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            str = str.trim();
            String arr[] = str.split("\\s+");
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                result.append(Character.toUpperCase(arr[i].charAt(0)));
                for (int j = 1; j < arr[i].length(); j++) {
                    result.append(Character.toLowerCase(arr[i].charAt(j)));
                }
                result.append(" ");
            }
            result.deleteCharAt(result.length() - 1 );
            System.out.println(result);
        }
        sc.close();
    }
}
