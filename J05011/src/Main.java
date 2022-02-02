import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Player> arr = new ArrayList<Player>();
        for (int i = 0; i < n; i++) {
            Player player = new Player();
            String id = sc.nextLine();
            String name = sc.nextLine();
            String timeStart = sc.nextLine();
            String timeEnd = sc.nextLine();
            player.setId(id);
            player.setName(name);
            player.setTime(timeStart, timeEnd);
            arr.add(player);
        }
        arr.sort((o1, o2) -> {
            if (o1.getMinute() > o2.getMinute()) {
                return -1;
            } else if (o1.getMinute() < o2.getMinute())
                return 1;
            return 0;
        });
        for (Player player : arr) {
            System.out.println(player);
        }
        sc.close();
        ;
    }
}
/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
 */
