package ThongKeTuKhacNhauTrongVanBan;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class thongke {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> words = new ArrayList<>();
        Pattern regex = Pattern.compile("[^A-Za-z0-9]");
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            for (String t : line) {
                Matcher matcher = regex.matcher(t);
                if (matcher.matches()) {
                    words.add(t);
                }
                else{
                    t = t.substring(0,t.length()-1);
                    words.add(t);
                }
            }
        }
        for(String t : words){
            System.out.println(t);
        }
        sc.close();
    }

}
