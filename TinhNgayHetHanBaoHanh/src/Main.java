import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> hsP = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            hsP.put(id, new Product(id, sc.nextLine(), Long.parseLong(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        ArrayList<List> arrL = new ArrayList<>();
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String id = String.format("KH%02d", i + 1);
            Customer cus = new Customer(id, sc.nextLine(), sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()), sc.nextLine());
            Product pro = hsP.get(cus.getMaSP());
            arrL.add(new List(cus, pro));
        }
        Collections.sort(arrL);
        for(List l : arrL){
            System.out.println(l);
        }
        sc.close();
    }

}

/*
2
KC740
May khoan KC1
39
18
KC742
May cat KC2
46
12
2
Le Ngoc Long
Hoang Mai
KC740
11
21/05/2009
Nguyen Sao Mai
Hoan Kiem
KC742
17
06/02/2009
 */
