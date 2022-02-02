import java.math.BigInteger;
import java.util.*;
public class J03011 {
    static long gcd(long a, long b){
        while(a != 0 && b != 0){
            if(a > b){
                a %= b;
            }
            else{
                b %= a;
            }
        }
        return a + b;
    }
    static long result(long a, BigInteger b) {
        BigInteger aBig = new BigInteger(String.valueOf(a));// convert a to BigInteger
        BigInteger mod = b.subtract(aBig.multiply(b.divide(aBig)));//phép chia dư
        Long modLong = Long.parseLong(mod.toString(10));//convert mod to Long, radix 10
        return gcd(a, modLong);
    }
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            long a = Long.parseLong(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            System.out.println(result(a,b));
        }
        sc.close();
    }
}
