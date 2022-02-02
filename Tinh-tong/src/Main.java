import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()){
            try{
                sum += Integer.parseInt(sc.next());
            }
            catch (NumberFormatException e){

            }
        }
        System.out.println(sum);
        sc.close();
    }
}