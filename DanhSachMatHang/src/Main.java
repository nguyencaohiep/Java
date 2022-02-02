import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arrP = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Product pro = new Product(i+1,sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            arrP.add(pro);
        }
        Collections.sort(arrP);
        for(Product pro : arrP){
            System.out.println(pro);
        }
        sc.close();
    }
}
/*
3
Ao phong tre em
Cai
25000
41000
Ao phong tre lon
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
 */