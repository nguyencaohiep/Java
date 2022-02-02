import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static class Char1 {
        private char value;
        private int ind;

        Char1(char value, int ind) {
            this.value = value;
            this.ind = ind;
        }
    }

    static int calc(String str) {
        List<Char1> arr = new ArrayList<>();
        int res = 0;
        arr.add(new Char1(' ', -1));
        for (int i = 0; i < str.length(); i++) {
            Char1 char1 = new Char1(str.charAt(i), i);
            arr.add(char1);
            while (arr.size() >= 3 && arr.get(arr.size() - 3).value == '1' && arr.get(arr.size() - 2).value == '0' && arr.get(arr.size() - 1).value == '0') {
                arr.remove(arr.size() - 1);
                arr.remove(arr.size() - 1);
                arr.remove(arr.size() - 1);
            }
            int tmp = arr.get(arr.size() - 1).ind;
            res = Math.max(res, i - tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String string = sc.nextLine();
            System.out.println(calc(string));
        }
        sc.close();
    }
}
/*
2
010010
1011110000
 */