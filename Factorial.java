import java.math.BigInteger;

public class Factorial {
     static String getFactorial(int n) {
        BigInteger fact = new BigInteger(n + "");
        if (fact.intValue() == 1)
            return "1";
        fact = fact.multiply(new BigInteger(getFactorial(n - 1)));
        return fact.toString();
        
    }
}
