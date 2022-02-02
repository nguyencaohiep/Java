import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Customer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Customer customer = new Customer(sc.nextLong(), sc.nextLong());
            arr.add(customer);
        }
        Collections.sort(arr);
        long res = arr.get(0).getExcutionTime() + arr.get(0).getStartTime();
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).getStartTime() == arr.get(i - 1).getStartTime())
                res += arr.get(i).getExcutionTime();
            else {
                if (res > arr.get(i).getStartTime())
                    res += arr.get(i).getExcutionTime();
                else
                    res = arr.get(i).getExcutionTime() + arr.get(i).getStartTime();
            }
        }
        System.out.println(res);
        sc.close();
    }
}
/*
3
2 1
8 3
5 7
 */