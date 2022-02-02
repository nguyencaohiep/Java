import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Station> arr = new ArrayList<>();
        boolean exist;
        for (int i = 0; i < n; i++) {
            exist = false;
            String name = sc.nextLine().trim();
            for (Station s1 : arr) {
                String tmp = s1.getName();
                if (tmp.equals(name)) {
                    exist = true;
                    long time = s1.getTime();
                    time += -LocalTime.parse(sc.nextLine()).toSecondOfDay() + LocalTime.parse(sc.nextLine()).toSecondOfDay();
                    s1.setTime(time);
                    s1.setHours(time);
                    s1.addNumber(Integer.parseInt(sc.nextLine()));
                    break;
                }
            }
            if (!exist) {
                Station station = new Station(name, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
                station.setId(arr.size() + 1);
                arr.add(station);
            }
        }
        for (Station station : arr) {
            System.out.println(station);
        }
        sc.close();
    }
}
/*
10
Dong Anh
07:30
08:00
60
Cau Giay
07:45
08:12
50
Soc Son
08:00
09:15
78
Dong Anh
18:50
20:00
88
Cau Giay
19:01
20:00
77
Soc Son
19:06
20:21
66
Dong Anh
21:00
21:40
49
Cau Giay
21:50
22:20
68
Dong Anh
22:15
23:45
30
Cau Giay
22:50
23:45
35
 */
