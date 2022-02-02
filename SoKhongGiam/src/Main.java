import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) (inputStream.readObject());
        HashMap<Integer, Integer> hs1 = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(Integer n : arr1){
            if(hs1.get(n) == null){
                hs1.put(n, 1);
                a.add(n);
            }
            else {
                hs1.replace(n, hs1.get(n) + 1);
            }
        }
        inputStream = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2 = (ArrayList<Integer>)(inputStream.readObject());
        HashMap<Integer, Integer> hs2 = new HashMap<>();
        for(Integer n : arr2){
            if(hs2.get(n) == null){
                hs2.put(n, 1);
            }
            else {
                hs2.replace(n, hs2.get(n) + 1);
            }

        }
        ArrayList<Integer> a1 = new ArrayList<>(hs1.keySet());
        ArrayList<Integer> res = new ArrayList<>();
        for(Integer n : a1){
            if(hs2.get(n) != null){
                res.add(n);
            }
        }
        Collections.sort(res);
        for(Integer n : res){
            if(check(n) && n > 10){
                System.out.println(n + " " + hs1.get(n) + " " + hs2.get(n));
            }
        }
    }

    public static boolean check(Integer n){
        String tmp = n + "";
        for(int i = 0; i < tmp.length() - 1; i++ ){
            if(tmp.charAt(i) > tmp.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
}
/*
 ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("DATA1.in"));
 ArrayList<Integer> arr1 = (ArrayList<Integer>) (inputStream.readObject());

 ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("DATA2.in"));
 ArrayList<Integer> arr2 = (ArrayList<Integer>) (inputStream.readObject());

 for(int i = 11 ; i<= 9999;i++){
    if(check(i)){
        int a = Collections.frequency(arr1, i);
        int b = Collections.frequency(arr2, i);
        if(a != 0 && b != 0){
            System.out.println(i + " " + a + " " + b);
         }
    }
 }
 */