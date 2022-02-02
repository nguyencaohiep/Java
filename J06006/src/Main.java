import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Customer> arrCus = new ArrayList<>();
        List<Product> arrPro = new ArrayList<>();
        List<Bill> arrBill = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Customer cus = new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arrCus.add(cus);
        }
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            Product pro = new Product(i + 1, sc.nextLine(), sc.nextLine(),
                    Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            arrPro.add(pro);
        }
        int k = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < k; i++) {
            int id = i + 1;
            String[] tmp = sc.nextLine().split(" ");
            String idCus = tmp[0];
            String nameCus = "", addressCus = "";
            for (Customer customer : arrCus) {
                if (customer.getId().equals(idCus)) {
                    nameCus = customer.getName();
                    addressCus = customer.getAddress();
                }
            }
            String idPro = tmp[1];
            String namePro = "";
            int profit = 1, money = 1;
            for (Product product : arrPro) {
                if (product.getId().equals(idPro)) {
                    namePro = product.getName();
                    profit = product.getProfit();
                    money = product.getPrice();
                }
            }
            int number = Integer.parseInt(tmp[2]);
            Bill bill = new Bill(id, nameCus, addressCus, namePro, number, money * number, profit * number);
            arrBill.add(bill);
        }
        arrBill.sort(((o1, o2) -> {
            int t1 = o1.getProfit();
            int t2 = o2.getProfit();
            if (t1 > t2)
                return -1;
            else if (t1 < t2)
                return 1;
            else
                return 0;
        }));
        for (Bill bill : arrBill) {
            System.out.println(bill);
        }
        sc.close();
    }
}
/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
 */