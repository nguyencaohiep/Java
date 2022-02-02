import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String half_start = solve(str.substring(0, str.length() / 2));
            String half_end = solve(str.substring(str.length() / 2));
            String res = "";
            for(int j = 0; j < half_start.length(); j++){
                res += (char)(((int)(half_start.charAt(j)) - 65 + (int)(half_end.charAt(j)) - 65) % 26 + 65) + "";
            }
            System.out.println(res);
        }
    }

    public static String solve(String str){
        int len = str.length();
        int s = sum(str);
        String res = "";
        for(int i = 0; i < len; i++){
            int t = ((int)(str.charAt(i)) + s - 65) % 26 + 65;
            res += (char)(t) + "";
        }
        return res;
    }

    public static int sum(String str){
        int s = 0;
        for(int i = 0; i < str.length(); i++){
            s += (int)(str.charAt(i)) - 65;
        }
        return s;
    }
}
/*
3
EWPGAJRB
BB
TPQJDRJWSQXGRRIPXFMINTELHBJA
 */