import java.math.BigInteger;
import java.util.*;

public class J03015{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        BigInteger s1 = new BigInteger(a);
        String b = sc.next();
        BigInteger s2 = new BigInteger(b);
        System.out.println(s1.subtract(s2));
        sc.close();
    }
}