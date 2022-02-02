import java.util.*;

public class J02014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int  n = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int ind = -1;
            int sum_left = 0;
            for(int i = 1; i < n - 1; i++){
               sum_left += arr[i - 1];
               if((sum - sum_left - arr[i]) == sum_left){
                   ind = i + 1;
                   break;
               }
            }
            System.out.println(ind);
        }
        sc.close();
    }
}