import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Customer> listCus = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Customer customer = new Customer(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listCus.add(customer);
        }
        int m = Integer.parseInt(sc.nextLine());
        List<Product> listPro = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Product product = new Product(i + 1, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine()));
            listPro.add(product);
        }
        int t = Integer.parseInt(sc.nextLine());
        List<Bill> listBill = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] input = sc.nextLine().trim().split("\\s+");
            String idCus = input[0];
            String idPro = input[1];
            Customer customer = new Customer();
            Product product = new Product();
            for (int j = 0; j < n; j++) {
                if (listCus.get(j).getIdCus().equals(idCus))
                    customer = listCus.get(j);
            }
            for (int j = 0; j < m; j++) {
                if (listPro.get(j).getIdPr().equals(idPro))
                    product = listPro.get(j);
            }
            int number = Integer.parseInt(input[2]);
            Bill bill = new Bill(i + 1, customer, product, number);
            listBill.add(bill);
        }
        for (Bill bill : listBill) {
            System.out.println(bill);
        }
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
