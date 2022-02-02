import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoaiBoSoNguyen {
    public static boolean checkInt(String s) {
        int intValue;
        try {
            intValue = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        long res = 0;
        ArrayList<String> quinn = new ArrayList<>();
        while (in.hasNext()) {
            String num = in.next();
            if(!checkInt(num)){
                quinn.add(num);
            }
        }
        quinn.sort(null);
        for (String s : quinn) {
            System.out.print(s + " ");
        }
    }
}