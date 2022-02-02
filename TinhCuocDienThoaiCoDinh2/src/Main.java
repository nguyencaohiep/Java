import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<City> arrCi = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            City c = new City(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arrCi.add(c);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Call> arrCa = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] line = sc.nextLine().split("\\s+");
            int price = 0;
            if(line[0].charAt(0) == '0'){
               City c1 =  arrCi.stream().filter(city -> city.getId().equals(line[0].substring(1,3))).findFirst().get();
               arrCa.add(new Call(line[0], line[1], line[2], c1));
            }
            else{
                City c2 = new City("00", "Noi mang", 800);
                arrCa.add(new Call(line[0], line[1], line[2], c2));
            }
        }
        Collections.sort(arrCa);
        for(Call ca : arrCa){
            System.out.println(ca);
        }
        sc.close();
    }
}
/*
2
53
Da Nang
3000
64
Vung Tau
1000
3
064-824531 11:20 11:22
8293567 09:07 09:15
053-823532 12:00 12:05
 */
