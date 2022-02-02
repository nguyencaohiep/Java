import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, City> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            City city = new City(id,sc.nextLine(),Integer.parseInt(sc.nextLine()));
            hm.put(id,city);
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Call> arrCall = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            if(line[0].charAt(0)!='0'){
                Call call = new Call(line[0],line[1],line[2]);
                arrCall.add(call);
            }
            else {
                Call call = new Call(line[0], line[1], line[2], hm.get(line[0].substring(1, 3)));
                arrCall.add(call);
            }
        }
        for(Call call : arrCall){
            System.out.println(call);
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
