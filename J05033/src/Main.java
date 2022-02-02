import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Time[] arr = new Time[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Time(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr);
        for (Time s : arr) {
            System.out.println(s);
        }
        sc.close();
    }
}
/*
3
11 20 20
14 20 14
11 15 12
 */