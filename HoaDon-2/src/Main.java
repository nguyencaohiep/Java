import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        HashMap<String,Customer> hsCus = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String id = String.format("KH%03d",i + 1);
            Customer cus = new Customer(id,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            hsCus.put(id,cus);
        }
        sc = new Scanner(new File("MH.in"));
        HashMap<String,Product> hsPro = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String id = String.format("MH%03d",i + 1);
            Product pro = new Product(id,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            hsPro.put(id,pro);
        }
        sc = new Scanner(new File("HD.in"));
        int z = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < z; i++) {
            String[] line = sc.nextLine().split("\\s+");
            Customer cus = hsCus.get(line[0]);
            Product pro = hsPro.get(line[1]);
            int cnt = Integer.parseInt(line[2]);
            Bill bill = new Bill(i + 1,cus,pro,cnt);
            System.out.println(bill);
        }
    }
}

