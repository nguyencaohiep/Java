import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String x = "";
        while (n-- > 0) {
            String input = sc.nextLine().trim().toLowerCase();
            String tmp[] = input.split("\\s+");
            input = "" + tmp[tmp.length - 1];
            for (int j = 0; j < tmp.length - 1; j++) {
                input += tmp[j].charAt(0);
            }
            String str[] = x.split(" ");
            int cou = 1;
            for (int j = 0; j < str.length; j++) {
                if (input.compareTo(str[j]) == 0) {
                    cou++;
                }
            }
            if (cou == 1) {
                System.out.println(input + "@ptit.edu.vn");
            } else {
                System.out.println(input + cou + "@ptit.edu.vn");
            }
            x += input + " ";
        }
        sc.close();
    }

}
