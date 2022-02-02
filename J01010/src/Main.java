import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String string = sc.nextLine();
            if (string.length() == check(string).length()) {
                String res = check(string);
                int ind = res.indexOf("1");
                if (ind != -1)
                    res = res.substring(ind);
                else
                    res = "INVALID";
                System.out.println(res);
            } else
                System.out.println("INVALID");

        }
        sc.close();
    }

    static String check(String str) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '0' || ch == '8' || ch == '9')
                tmp.append("0");
            else if (ch == '1')
                tmp.append("1");
            else {
                break;
            }
        }
        return tmp.toString();
    }
}
/*
3
1890
3681
8919
 */