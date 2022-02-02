import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int tmp = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> unique = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
                if(unique.contains(arr[i]) == false)
                    unique.add(arr[i]);
            }
            System.out.printf("Test %d:\n",tmp);
            for(int i = 0; i < unique.size(); i++){
                int cou = 0;
                int a = unique.get(i);
                for(int j = 0; j < n; j++){
                    if(arr[j] == a){
                        cou++;
                    }
                }
                System.out.printf("%d xuat hien %d lan\n",a,cou);
            }
            tmp++;
        }
        sc.close();
    }
}
