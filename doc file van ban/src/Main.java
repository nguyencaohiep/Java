import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();

    }
}
