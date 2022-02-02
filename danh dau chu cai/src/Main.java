import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        HashMap<Character,Integer> hs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!hs.containsKey(c)){
                hs.put(c,1);
            }
        }
        System.out.println(hs.size());
        sc.close();
    }
}
