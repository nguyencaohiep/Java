import java.util.*;
public class J01012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            int result = 0;
            if(n % 2 != 0)
                System.out.println(result);
            else{
                result = 1;
                long sq = (long)(Math.sqrt(n));
                for(long i = 2; i <= sq; i++)
                    if(n % i == 0){
                        if(i % 2 == 0)
                            result += 1;
                        if((n / i) % 2 == 0)
                            result += 1;
                    }
                if(sq * sq == n)
                    result -= 1;
                System.out.println(result);
            }                 
        }
        sc.close();
    }
}
