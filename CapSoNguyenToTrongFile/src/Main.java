import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Main {
    public static void main(String[] args) throws Exception{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)(input.readObject());
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for(Integer n : arr1){
            if(isPrime(n)){
                hm1.put(n,1);
            }
        }
        ArrayList<Integer> arrKey1 = new ArrayList<>(hm1.keySet());
        Collections.sort(arrKey1);
        input = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>)(input.readObject());
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        for(Integer n : arr2){
            if(isPrime(n)){
                hm2.put(n,1);
            }
        }
        for(Integer n : arrKey1){
            int m = 1000000 - n;
            if(hm2.get(m) != null && n < m){
                System.out.println(n + " " + m);
            }
        }
        input.close();
    }

    public static boolean isPrime(Integer n){
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
