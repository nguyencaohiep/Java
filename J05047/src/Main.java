import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> arr = new ArrayList<>();
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String[] tmp = name.split("\\s+");
            String t = "" + Character.toUpperCase(tmp[0].charAt(0)) + "" + Character.toUpperCase(tmp[1].charAt(0));
            if (hs.containsKey(t)) {
                int cou = hs.get(t) + 1;
                hs.put(t, cou);
            } else {
                hs.put(t, 1);
            }
            String id = t + String.format("%02d", hs.get(t));
            Product product = new Product(id, name, Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine()));
            arr.add(product);
        }
        arr.sort((o1, o2) -> {
            if (o1.getDiscountMoney() < o2.getDiscountMoney())
                return 1;
            else if (o1.getDiscountMoney() > o2.getDiscountMoney())
                return -1;
            else
                return 0;
        });
        for (Product product : arr) {
            System.out.println(product);
        }
        sc.close();
    }
}
/*
3
May lanh SANYO
12
4000000
Dien thoai Samsung
30
3230000
Dien thoai Nokia
18
1240000
 */