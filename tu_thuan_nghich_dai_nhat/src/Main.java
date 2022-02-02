import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Words> arr = new ArrayList<>();
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if (input.equals(""))
                break;
            String[] tmp = input.trim().split("\\s+");
            for (int i = 0; i < tmp.length; i++) {
                if (check(tmp[i])) {
                    Words words = new Words(tmp[i], tmp[i].length());
                    arr.add(words);
                }
            }
        }
        arr.sort(((o1, o2) -> {
            int len1 = o1.getLen();
            int len2 = o2.getLen();
            return Integer.compare(len1, len2) * -1;
        }));
        int len = arr.get(0).getLen();
        int start = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i).getLen() == len) {
                if (!arr.get(i).getContent().equals(arr.get(i + 1).getContent())) {
                    System.out.println(arr.get(start).getContent() + " " + (i + 1 - start));
                    start = i + 1;
                }
            } else
                break;
        }
        if (arr.get(arr.size() - 1).getLen() == len)
            System.out.println(arr.get(arr.size() - 1).getContent() + (arr.size() - start));
        sc.close();
    }

    public static boolean check(String str) {
        String tmp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tmp += str.charAt(i) + "";
        }
        return str.equals(tmp);
    }
}
/*
AAA BAABA HDHDH ACBSD SRGTDH DDDDS
DUAHD AAA AD DA HDHDH AAA AAA AAA AAA
DDDAS HDHDH HDH AAA AAA AAA AAA AAA
AAA AAA AAA
DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD
TDTD
 */
