import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Club> hsClub = new HashMap<>();
        while(n-- > 0){
            String id = sc.nextLine();
            Club cl = new Club(id, sc.nextLine(), Integer.parseInt(sc.nextLine()));
            hsClub.put(id, cl);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Match> arr = new ArrayList<>();
        while(m-- > 0){
            String[] s = sc.nextLine().split("\\s+");
            Club cl = hsClub.get(s[0].substring(1,3));
//            System.out.println(cl);
            Match ma = new Match(s[0], Integer.parseInt(s[1]), cl);
//            System.out.println(ma);
            arr.add(ma);
        }
        Collections.sort(arr);
        for(Match ma : arr){
            System.out.println(ma);
        }
        sc.close();
    }
}
/*
2
AC
AC Milan
12
MU
Manchester United
10
2
EMU2 60000
IAC1 80000
 */