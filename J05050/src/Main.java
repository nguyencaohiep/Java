import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Customer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Customer customer = new Customer(i + 1, sc.nextLine(), Long.parseLong(sc.nextLine()),
                    Long.parseLong(sc.nextLine()));
            arr.add(customer);
        }
        for(Customer customer : arr){
            System.out.println(customer);
        }
        sc.close();
    }
}
/*
3
KD
400
555
NN
58
400
CN
150
700
 */
