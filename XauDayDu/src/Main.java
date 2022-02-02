import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int  k = Integer.parseInt(sc.nextLine());
            if(str.length() < 26){
                System.out.println("NO");
            }
            else{
                HashMap<Character, Integer> hm = new HashMap<>();
                for(int j = 0; j < str.length(); j++){
                    char c = str.charAt(j);
                    if(hm.get(c) == null){
                        hm.put(c, 1);
                    }
                }
                if(26 - hm.size() <= k){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
/*
2
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
4
qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
24
 */
