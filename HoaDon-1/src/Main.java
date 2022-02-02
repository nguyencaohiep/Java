import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        HashMap<String,Product> arrP = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int price1 = Integer.parseInt(sc.nextLine());
            int price2 = Integer.parseInt(sc.nextLine());
            Product product = new Product(id,name,price1,price2);
            arrP.put(id,product);
        }
        sc = new Scanner(new File("DATA2.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> arrBill = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] line = sc.nextLine().trim().split("\\s+");
            Product product = arrP.get(line[0].substring(0,2));
            Bill bill = new Bill(line[0],line[1],i + 1,product);
            arrBill.add(bill);
        }
        for(Bill tmp : arrBill){
            System.out.println(tmp);
        }
        sc.close();
    }
}
