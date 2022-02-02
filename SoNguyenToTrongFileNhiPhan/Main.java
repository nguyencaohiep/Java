package SoNguyenToTrongFileNhiPhan;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] prime = new int[10001];
        prime[0] = prime[1] = 1;
        for (int i = 2; i < 10001; i++) {
            if (prime[i] == 0) {
                for (int j = i * 2; j < 10001; j += i) {
                    prime[j] = 1;
                }
            }
        }
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        FileInputStream input = new FileInputStream(new File("SONGUYEN.in"));
        ObjectInputStream object = new ObjectInputStream(input);
        ArrayList<Integer> arr = (ArrayList<Integer>) (object.readObject());
        for (Integer tmp : arr) {
            if (prime[tmp] == 0) {
                if (hm.get(tmp) == null) {
                    hm.put(tmp, 1);
                } else {
                    hm.replace(tmp, hm.get(tmp) + 1);
                }
            }
        }

        ArrayList<Integer> res = new ArrayList<>(hm.keySet());
        Collections.sort(res);
        for (Integer t : res) {
            System.out.println(t + " " + hm.get(t));
        }
        object.close();
    }
}
