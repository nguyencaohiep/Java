import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals(""))
                break;
            input += str;
        }
        String[] tmp = input.trim().split("\\?|\\!|\\.");
        for (String s : tmp) {
            s = s.trim().replaceAll("\\s+", " ").toLowerCase();
            String res = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            System.out.println(res);
        }
        sc.close();
    }
}
/*
ky thi LAP TRINH ICPC PTIT  bat dau to chuc     tu     nam 2010. nhu vay, nam nay la          tron 10 nam!
    vay CO PHAI NAM NAY LA KY THI LAN THU 10?        khong phai! nam nay la KY THI LAN THU 11.
 */