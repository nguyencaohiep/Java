import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("DATA.in"));
        String input = "";
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
        }
        while(input.length()!=1){
            int half = (int)(input.length()/2);
            BigInteger str1 = new BigInteger(input.substring(0,half));
            BigInteger str2 = new BigInteger(input.substring(half));
            BigInteger res = str1.add(str2);
            System.out.println(res);
            input = String.valueOf(res);
        }
    }
}