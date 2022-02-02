import java.util.*;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = str;
        boolean check = false;
        while (check == false) {
            check = check(result);
            result = solve(result);
        }
        if (result.length() > 0) {
            System.out.println(result);
        } else {
            System.out.println("Empty String");
        }
        sc.close();
    }

    static boolean check(String str) {
        if (str.length() == 1)
            return true;
        for (int i = 0; i < str.length() - 1; i++)
            if (str.charAt(i) == str.charAt(i + 1))
                return false;
        return true;
    }

    static String solve(String str) {
        String result = "";
        int i = 0;
        for (i = 0; i < str.length() - 1;) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                result += str.charAt(i);
                i++;
            } else {
                i += 2;
            }
        }
        if (i == str.length() - 1) {
            result += str.charAt(str.length() - 1);
        }
        return result;
    }
}
