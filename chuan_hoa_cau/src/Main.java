import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> line = new ArrayList<>();
        while (sc.hasNextLine()) {
            String tmp = sc.nextLine();
            if (tmp.equals(""))
                break;
            char c = tmp.charAt(tmp.length() - 1);
            if (c != '.' && c != '!' && c != '?')
                tmp += ".";
            line.add(tmp.toLowerCase().replaceAll("\\s+", " "));
        }
        for (String li : line) {
            String[] word = li.split(" ");
            String res = "";
            res += Character.toUpperCase(word[0].charAt(0)) + word[0].substring(1) + " ";
            for (int i = 1; i < word.length - 1; i++) {
                char c = word[i - 1].charAt(word[i - 1].length() - 1);
                if (c == '.' || c == '!' || c == '?')
                    res += Character.toUpperCase(word[i].charAt(0)) + word[i].substring(1);
                else
                    res += word[i];
                if (!word[i + 1].equals(".") && !word[i + 1].equals("?") && !word[i + 1].equals("!"))
                    res += " ";
            }
            res += word[word.length - 1];
            System.out.println(res);
        }


        sc.close();
    }
}
/*
Chuong trinh Dao Tao CLC . nganh CNTT duoc Thiet     Ke theo chuan quoc te.
co 03 chuyen nganh la: Cong  nghe phan mem, Tri tue nhan tao va An toan thong tin
muc tieu cua chuong trinh la trang bi cho sinh vien cac ky nang nghe nghiep
moi    CAC BAN danG ky     thaM giA !
 */