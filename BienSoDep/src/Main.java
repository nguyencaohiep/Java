import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(check(str));
        }
        sc.close();
    }

    public static String check(String str){
        int f1 = Integer.parseInt(String.valueOf(str.charAt(5)));
        int f2 = Integer.parseInt(String.valueOf(str.charAt(6)));
        int f3 = Integer.parseInt(String.valueOf(str.charAt(7)));
        int s1 = Integer.parseInt(String.valueOf(str.charAt(9)));
        int s2 = Integer.parseInt(String.valueOf(str.charAt(10)));
        if( f1 < f2 && f2 < f3 && f3 < s1 && s1 < s2)
            return "YES";
        if( f1 == f2 && f2 == f3 && f3 == s1 && s1 ==s2)
            return "YES";
        if(f1 == f2 && f2 == f3 && s1 == s2)
            return "YES";
        if(check2(f1) && check2(f2) && check2(f3) && check2(s1) && check2(s2))
            return "YES";
        return "NO";
    }

    public static boolean check2(Integer n){
        if(n != 6 && n != 8)
            return false;
        return true;
    }
}
/*
7
29T1–123.45
29T1–555.55
29T1–222.33
29T1–686.88
29T1–123.33
29T1–555.54
29T1–606.88
 */