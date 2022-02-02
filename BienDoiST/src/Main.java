import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            System.out.println(calc(s,t));
        }
    }

    private static long calc(int s, int t){
       if(t <= s)
           return s - t;
       else{
           if(t % 2 == 0)
               return 1 + calc(s,t / 2);
           else
               return 2 + calc(s,(t + 1) / 2);
       }
    }
}
