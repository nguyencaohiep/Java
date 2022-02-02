import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Main {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)(input.readObject());
        for(Integer n : arr1){
            if(isPrime(n)){
                if(hm1.get(n) == null){
                    hm1.put(n, 1);
                    hm.put(n, 1);
                }
                else{
                    hm1.replace(n, hm1.get(n) + 1);
                }
            }
        }
        input = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>)(input.readObject());
        for(Integer n : arr2){
            if(isPrime(n)){
                if(hm2.get(n) == null){
                    hm2.put(n, 1);
                    hm.put(n, 1);
                }
                else{
                    hm2.replace(n, hm2.get(n) + 1);
                }
            }
        }
        ArrayList<Integer> arrRe = new ArrayList<>(hm.keySet());
        Collections.sort(arrRe);
        for(Integer n : arrRe){
            System.out.println(n + " " + hm1.get(n) + " " + hm2.get(n));
        }
        input.close();
    }

    public static boolean isPrime(Integer n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }
}
