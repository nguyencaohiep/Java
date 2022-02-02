import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Athlete> arr = new ArrayList<>();
        List<Integer> time = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Athlete athlete = new Athlete(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(athlete);
            time.add(athlete.getTimeToRank());
        }
        Collections.sort(time);
        arr.sort((a,b) -> a.getTimeToRank().compareTo(b.getTimeToRank()));
        for (Athlete athlete : arr) {
            Integer rank = rank(time, athlete.getTimeToRank());
            System.out.println(athlete + " " + rank);
        }
        sc.close();
    }

    public static Integer rank(List<Integer> arr, Integer time) {
        for (int i = 0; i < arr.size(); i++) {
            if (Objects.equals(arr.get(i), time))
                return i + 1;
        }
        return 0;
    }
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
 */