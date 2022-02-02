import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine().toLowerCase();
            StringBuilder res = new StringBuilder();
            for (int j = 0; j < input.length(); j++) {
                char tmp = input.charAt(j);
                if (tmp == 'a' || tmp == 'b' || tmp == 'c')
                    res.append("2");
                else if (tmp == 'd' || tmp == 'e' || tmp == 'f')
                    res.append("3");
                else if (tmp == 'g' || tmp == 'h' || tmp == 'i')
                    res.append("4");
                else if (tmp == 'j' || tmp == 'k' || tmp == 'l')
                    res.append("5");
                else if (tmp == 'm' || tmp == 'n' || tmp == 'o')
                    res.append("6");
                else if(tmp == 'p'||tmp == 'q' || tmp =='r'||tmp=='s')
                    res.append("7");
                else if(tmp == 't' || tmp == 'u' || tmp == 'v')
                    res.append("8");
                else
                    res.append("9");
            }
            if(res.toString().contentEquals(res.reverse()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
/*
2
BOHIMA
IamACoder
 */