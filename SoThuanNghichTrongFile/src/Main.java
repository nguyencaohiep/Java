import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.StringBuilder;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>)(input.readObject());
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        for(Integer n : arr1){
            String t = n + "";
            int len = t.length();
            if(len >  1 && len % 2 == 1 && reversible(t) && odd(n)){
                if(hm1.get(n) == null) {
                    hm1.put(n, 1);
                }
                else{
                    hm1.replace(n, hm1.get(n) + 1);
                }
            }
        }
        input = new ObjectInputStream(new FileInputStream("DATA2.in"));
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        ArrayList<Integer> arr2 = (ArrayList<Integer>)(input.readObject());
        for(Integer n : arr2){
            String t = n + "";
            int len = t.length();
            if(len >  1 && len % 2 == 1 && reversible(t) && odd(n)){
                if(hm2.get(n) == null) {
                    hm2.put(n, 1);
                }
                else{
                    hm2.replace(n, hm2.get(n) + 1);
                }
            }
        }
        ArrayList<Integer> arr = new ArrayList<>(hm1.keySet());
        ArrayList<Integer> res = new ArrayList<>();
        for(Integer n : arr){
            if(hm2.get(n) != null){
                res.add(n);
            }
        }
        Collections.sort(res);
        int len = res.size();
        if(len > 10){
            len = 10;
        }
        for (int i = 0; i < len; i++) {
            System.out.println(res.get(i) + " " + (hm1.get(res.get(i)) + hm2.get(res.get(i))));
        }
        input.close();
    }

    public static boolean reversible(String str){
        StringBuilder tmp = new StringBuilder(str);
        if(str.equals(tmp.reverse().toString()))
            return true;
        return false;
    }

    public static boolean odd(Integer n){
        while(n > 0){
            int m = n % 10;
            if(m % 2 == 0)
                return false;
            n /= 10;
        }
        return true;
    }
}
